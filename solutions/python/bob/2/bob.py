def response(hey_bob):
    """
    Returns string tailored response to input string for Bob
    """
    hey = hey_bob.strip()
    
    if hey == "":
        return "Fine. Be that way!"
        
    if hey.endswith('?'):
        if hey.isupper():
            return "Calm down, I know what I'm doing!"
        
        return "Sure."
            
    if hey.isupper():
            return "Whoa, chill out!"
        
    return "Whatever."