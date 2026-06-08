def is_pangram(sentence):
    """
    Checks if sentence has all alphabets
    """
    if not sentence:
        return False
        
    sentence = sentence.lower()
    letter_list = []

    for alpha in sentence:
        if alpha.isalpha():
            if alpha not in letter_list:
                letter_list.append(alpha)

    return len(letter_list) == 26