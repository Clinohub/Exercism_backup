def is_valid(isbn):
    ISBN_COUNT = 10
    
    isbn = isbn.lower().strip()

    if not isbn:
        return False

    if not isbn[-1].isdigit() and not isbn.endswith("x"):
        return False

    isbn_list = []
    for character in isbn:
        if not character == "-":
            if character.isdigit():
                isbn_list.append(int(character))
            else:
                isbn_list.append(character)

    if len(isbn_list) != ISBN_COUNT:
        return False

    if isbn_list[-1] == "x":
        isbn_list[-1] = ISBN_COUNT

    total = 0
    modifier = ISBN_COUNT
    for number in isbn_list:
        if type(number) == str:
            return False

        total += number * modifier
        modifier -= 1

    return total%11 == 0
