def leap_year(year):
    """
    Returns True if year is a leap , otherwise false.
    """
    if not isinstance(year, int):
        raise TypeError("Year must be an integer")

    return year % 4 == 0 and (year % 400 == 0 or not year % 100 == 0) 