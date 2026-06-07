def convert(number):
    """
    Convert numbers into its responding raindrop sound
    """
    raindrop = ""
    
    if number%3 == 0:
        raindrop += "Pling"

    if number%5 == 0:
        raindrop += "Plang"
    
    if number%7 == 0:
        return raindrop + "Plong"
    elif not raindrop:
        return f"{number}"

    return raindrop