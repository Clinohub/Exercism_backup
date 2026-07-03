def rotate(text, key):
    if not text:
        return text

    import string
    small = string.ascii_lowercase
    caps = string.ascii_uppercase

    key %= 26

    encode = ""
    for letter in text:
        if letter in small:
            encode += small[(small.find(letter) + key)%26]
        elif letter in caps:
            encode += caps[(caps.find(letter) + key)%26]
        else:
            encode += letter

    return encode