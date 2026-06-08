class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        // negatives not Armstrong 
        if (numberToCheck < 0)
            return false;

        // one digit numbers are Armstrong 
        if (numberToCheck/10 == 0)
            return true;

        int numberOfDigits = 0;
        int number = numberToCheck;
        while (number != 0) {
            number /= 10;
            numberOfDigits++;
        }

        int i = numberToCheck;
        while (i != 0) {
            number += (int)Math.pow(i%10, numberOfDigits);
            i /= 10;
        }

        return number == numberToCheck;

    }

}