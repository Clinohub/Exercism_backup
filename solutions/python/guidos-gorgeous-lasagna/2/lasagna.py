"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""


EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2

def bake_time_remaining(elapsed_bake_time):
    """Calculate the bake time remaining.

    Parameters:
        elapsed_bake_time (int): The baking time already elapsed.

    Returns:
        int: The remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """

    return EXPECTED_BAKE_TIME - elapsed_bake_time


def preparation_time_in_minutes(number_of_layers):
    """Calculate the preparation time.

    Parameters:
        number_of_layers (int): The layers of in the lasagna.

    Returns:
        int: Time taken to prepare the lasagna(in minutes).

    Function takes number of layers in lasagna as an argument and returns total time taken in minutes to prepare the lasagna.
    """

    return number_of_layers * PREPARATION_TIME

def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate the elapsed time.

        Parameters:
            number_of_layers (int): The layers of in the lasagna.
            elapsed_bake_time (int): The time elapsed while baking.

        Return:
            int: The time taken(in minutes) to prepare and bake lasagna.

        Function takes two integers, representing layers of lasagna and baking time as arguments and returns total time taken to prepare and bake lasagna by calling preparation_time_in_minutes(number_of_layers) function.
        
    """
        
    return preparation_time_in_minutes(number_of_layers) + elapsed_bake_time