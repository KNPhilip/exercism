import java.util.Arrays;

public final class ResistorColor {
    private final String[] colors = {
        "black", 
        "brown", 
        "red", 
        "orange", 
        "yellow", 
        "green", 
        "blue", 
        "violet", 
        "grey", 
        "white"};
    
    public int colorCode(String color) {
        return Arrays.asList(colors()).indexOf(color);
    }

    public String[] colors() {
        return colors;
    }
}
