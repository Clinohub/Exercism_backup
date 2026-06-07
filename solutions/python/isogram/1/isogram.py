def is_isogram(string):
    """
    Returns True if isogram else false
    """
    string = string.lower()
    
    for num in range(1, len(string)):
        if string[num - 1].isalpha():
            if string[num - 1] in string[num ::]:
                return False

    return True
