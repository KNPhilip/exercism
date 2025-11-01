import java.util.List;
import java.util.Arrays;

public final class Acronym {
    private String phrase;
    
    public Acronym(String phrase) {
        this.phrase = phrase
            .replace("_", "")
            .replace("-", " ");
    }

    public String get() {
        List<String> words = Arrays.asList(phrase.split(" "));
        String acronym = "";

        for (String word : words)
            if (!word.trim().isEmpty())
                acronym += word.toCharArray()[0];
        
        return acronym.toUpperCase();
    }
}
