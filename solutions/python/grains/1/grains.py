"""
Finds the exponent of base 2
"""
def square(number):
    """
    Finds the number of grains for a given position square on the chessboard
    """
    if 0 < number <= 64:
        return 2**(number - 1)

    raise ValueError("square must be between 1 and 64")

"""
Finds the total
"""
def total():
    """
    Finds the total grains in the chessboard
    """
    n = 0
    for i in range(1, 64+1):
        n += square(i)

    return n