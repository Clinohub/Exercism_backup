def equilateral(sides):
    if valid_triangle(sides):
        return sides[0] == sides[1] and sides[1] == sides[2] and sides[0] == sides[2]

    return False


def isosceles(sides):
    if valid_triangle(sides):
       return equilateral(sides) or not scalene(sides)

    return False


def scalene(sides):
    if valid_triangle(sides):
       if sides[0] == sides[1] or sides[1] == sides[2]:
           return False
           
       return sides[0] != sides[2]

    return False


def valid_triangle(sides):
    for side in sides:
        if side <= 0:
            return False

    return (sides[0] + sides[1]) >= sides[2] and (sides[1] + sides[2]) >= sides[0] and (sides[0] + sides[2]) >= sides[1]