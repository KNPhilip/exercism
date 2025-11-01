import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public final class Acronym {
    private String phrase;
    
    public Acronym(String phrase) {
        this.phrase = phrase
            .replace("_", "")
            .replace(" - ", " ");
    }

    public String get() {
        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList(phrase.split("-|\\ ")));

        String result = "";

        for (String word : words)
            result += word.toCharArray()[0];
        
        return result.toUpperCase();
    }
}
