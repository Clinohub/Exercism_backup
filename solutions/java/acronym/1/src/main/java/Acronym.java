class Acronym {

    private String phrase;

    Acronym(String phrase) {
        String copyPhrase = new String(phrase);
        this.phrase = copyPhrase;
    }

    String get() {
        if (phrase == null || phrase.isEmpty())
            return "";
        
        String toAcronym = phrase;
        StringBuilder sb = new StringBuilder();
        char alphabet = toAcronym.charAt(0);
        sb.append(alphabet);
        for (int i = 1; i<toAcronym.length(); i++) {
            alphabet = toAcronym.charAt(i);
            if (alphabet != '\'' && !(isEnglishAlphabet(alphabet))) {
                if (i+1 < toAcronym.length() && isEnglishAlphabet(toAcronym.charAt(i+1)))
                    sb.append(upperCase(toAcronym.charAt(i+1)));
            }
        }
        return sb.toString();
      
    }

  
    private boolean isEnglishAlphabet(char ch) {
      return (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z');
    }

  
    private char upperCase(char c) {
      if (c >= 'A' && c <= 'Z')
        return c;

      return (char)((int)c - 32);
    }
}