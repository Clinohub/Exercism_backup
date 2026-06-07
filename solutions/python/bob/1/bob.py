def response(hey_bob):
    hey = hey_bob.strip()
    
    if hey == "":
        return "Fine. Be that way!"
        
    if hey[len(hey) - 1] == '?':
        if hey.upper() == hey and hey.title() != hey:
            return "Calm down, I know what I'm doing!"
        else:
            return "Sure."
            
    if hey_bob.upper() == hey_bob and hey.title() != hey:
            return "Whoa, chill out!"
        
    return "Whatever."