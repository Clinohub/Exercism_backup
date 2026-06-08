public class Hamming {
    private String leftStrand;
    private String rightStrand;
    
    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
        
        this.leftStrand = new String(leftStrand);
        this.rightStrand = new String(rightStrand);
    }

    public int getHammingDistance() {
        int hammingDistance = 0;
        for (int i=0; i<leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i))
                hammingDistance++;
        }
        return hammingDistance;
    }
}
