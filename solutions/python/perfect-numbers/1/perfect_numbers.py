def classify(number):
    """ A perfect number equals the sum of its positive divisors.

    :param number: int a positive integer
    :return: str the classification of the input integer
    """
    if number <= 0:
        raise ValueError("Classification is only possible for positive integers.")

    if number == 1:
        return "deficient"

    num_list = [1]
    for divisor in range(2,number//2):
        if number%divisor == 0 and divisor not in num_list:
            num_list.append(divisor)
            if number//divisor not in num_list:
                num_list.append(number//divisor)

            if sum(num_list) >  number:
                return "abundant"

    if sum(num_list) == number:
        return "perfect"

    return "deficient"