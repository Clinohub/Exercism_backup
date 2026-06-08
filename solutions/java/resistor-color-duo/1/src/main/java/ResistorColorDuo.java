import java.util.Map;

class ResistorColorDuo {
    Map<String, Integer> band = Map.of("black", 0, "brown", 1, "red", 2, "orange", 3, "yellow", 4, "green", 5, "blue", 6, "violet", 7, "grey", 8, "white", 9);
    
    int value(String[] colors) {
        if (colors.length == 0)
            return -1;
        
        int code = band.get(colors[0]);
        if (colors.length >= 2) {
            if (code == 0)
                code = band.get(colors[1]);
            else
                code = code*10 + band.get(colors[1]);
        }
        
        return code;
    }
}
