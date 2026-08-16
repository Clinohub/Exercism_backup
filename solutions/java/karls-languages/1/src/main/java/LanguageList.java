import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return this.languages == null || this.languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        this.languages.remove(language);
    }

    public String firstLanguage() {
        return this.languages.getFirst();
    }

    public int count() {
        return this.languages.size();
    }

    public boolean containsLanguage(String language) {
        for(String aLanguage: this.languages){
            if(aLanguage == language) return true;
        }
        return false;
    }

    public boolean isExciting() {
        return containsLanguage("Kotlin") || containsLanguage("Java");
    }
}
