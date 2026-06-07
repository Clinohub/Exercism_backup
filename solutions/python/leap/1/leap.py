def leap_year(year):

    if year % 4 == 0:
        return year % 400 == 0 or not year % 100 == 0

    return False
        
    