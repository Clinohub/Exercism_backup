
class ReverseString {

    String reverse(String inputString) {
        if (inputString.length() < 2) {
            return inputString;
        }

        int stringLength = inputString.length();
        String reverseString = "";

        for (int i=stringLength - 1; i>=0; i--) {
            reverseString += inputString.charAt(i);
        }
        return reverseString;
        
    }
  
}
