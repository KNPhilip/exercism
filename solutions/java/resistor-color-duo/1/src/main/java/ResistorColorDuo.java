import java.util.Map;

public final class ResistorColorDuo {
    private final Map<String, String> colorMap = Map.of(
        "black", "0",
        "brown", "1",
        "red", "2",
        "orange", "3",
        "yellow", "4",
        "green", "5",
        "blue", "6",
        "violet", "7",
        "grey", "8",
        "white", "9"
    );
    
    public int value(String[] colors) {
        String firstColor = colorMap.get(colors[0]);
        String secondColor = colorMap.get(colors[1]);
        return Integer.parseInt(firstColor + secondColor);
    }
}
