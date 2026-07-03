public class Say {

    public String say(long number) {
        if (number < 0)
            throw new IllegalArgumentException("numbers below 0 are out of range");

        if (number > 999_999_999_999L)
            throw new IllegalArgumentException("numbers above 999,999,999,999 are out of range");

        if (number == 0)
            return "zero";

        StringBuilder numberInWords = new StringBuilder();

        while(number >= 1000) {
            if (!(numberInWords.isEmpty()))
                numberInWords.append(" ");

            if (number >= 1_000_000_000) {
                numberInWords.append(tripleDigit((int)(number/1_000_000_000)) + " billion");
                number %= 1_000_000_000;
                continue;
            }

            if (number >= 1_000_000) {
                numberInWords.append(tripleDigit((int)number/1_000_000) + " million");
                number %= 1_000_000;
                continue;
            }

            if (number >= 1_000) {
                numberInWords.append(tripleDigit((int)number/1_000) + " thousand");
                number %= 1_000;
                continue;
            }
            
        }
        if (!(numberInWords.isEmpty() || number == 0))
                numberInWords.append(" ");

        return numberInWords.append(tripleDigit((int)number)).toString();
        
    }


    String tripleDigit(int lessThanThousand) {
        if (lessThanThousand < 100)
            return lessThanHundred(lessThanThousand);

        if (lessThanThousand%100 == 0)
            return singleDigit(lessThanThousand/100)+" hundred";

        return singleDigit(lessThanThousand/100)+" hundred "+lessThanHundred(lessThanThousand%100);
    }


    /**
     * Writes an number in words.
     * 
     * <p>This method converts an integer to words.</p>
     * 
     * @param lessThanTen (Should be less than 10 and greater than or equal to 0)
     * @return (String (lt100 number in words)
     */
    String singleDigit(int lessThanTen) {
        switch (lessThanTen) {
            case 9: return "nine";
            case 8: return "eight";
            case 7: return "seven";
            case 6: return "six";
            case 5: return "five";
            case 4: return "four";
            case 3: return "three";
            case 2: return "two";
            case 1: return "one";
        
            default:
                return "";
        }
    }


    /**
     * Writes an number in words.
     * 
     * <p>This method converts an integer to words by calling
	 * {@link #singleDigit(int lessThanTen)}.</p>
     * 
     * @param lt20 (Should be less than 20 and greater than or equal to 0)
     * @return (String (lt100 number in words)
     */
    String lessThanTwenty(int lt20) {
        switch (lt20) {
            case 19: return "nineteen";
            case 18: return "eighteen";
            case 17: return "seventeen";
            case 16: return "sixteen";
            case 15: return "fifteen";
            case 14: return "fourteen";
            case 13: return "thirteen";
            case 12: return "twelve";
            case 11: return "eleven";
            case 10: return "ten";
        
            default:
                return singleDigit(lt20);
        }
    }

    
    /**
     * Writes an number in words.
     * 
     * <p>This method converts an integer to words by calling
	 * {@link #lessThanTwenty(int lt20)}.</p>
     * 
     * @param lt100 (Should be less than 100 and greater than or equal to 0)
     * @return String (lt100 number in words)
     */
    String lessThanHundred(int lt100) {
        String lt100String ="";

        if (lt100 >= 90)
            lt100String = "ninety";
        else if (lt100 >= 80)
            lt100String = "eighty";
        else if (lt100 >= 70)
            lt100String = "seventy";
        else if (lt100 >= 60)
            lt100String = "sixty";
        else if (lt100 >= 50)
            lt100String = "fifty";
        else if (lt100 >= 40)
            lt100String = "forty";
        else if (lt100 >= 30)
            lt100String = "thirty";
        else if (lt100 >= 20)
            lt100String = "twenty";
        else
            return lessThanTwenty(lt100);

    
        if (lt100 >= 20 && lt100%10 == 0)
            return lt100String;


        return lt100String+"-"+lessThanTwenty(lt100%10);
    }
}