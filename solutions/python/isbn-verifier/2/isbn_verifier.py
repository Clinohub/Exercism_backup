def is_valid(isbn):

    if not isbn:
        return False

    isbn = isbn.replace("-", "")
    
    if not isbn[-1].isdigit() and not isbn.endswith("X"):
        return False
    
    if len(isbn) != 10:
        return False

    total = 0 
    for index in range(len(isbn) - 1):
        if not isbn[index].isdigit():
                return False
            
        total += int(isbn[index]) * (10 - index)

    if isbn.endswith("X"):
        return (total + 10)%11 == 0

    if isbn[-1].isdigit():
        return (total + int(isbn[-1]))%11 == 0

    return False
