def color_code(color):
    for color_code in range(len(colors())):
        if colors()[color_code] == color:
            return color_code

        
def colors():
    return ["black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"]
