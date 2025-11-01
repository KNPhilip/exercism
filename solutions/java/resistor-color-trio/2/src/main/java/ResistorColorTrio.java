import java.util.Map;

public final class ResistorColorTrio {
    private Map<String, Integer> colorBands = Map.of(
        "black", 0,
        "brown", 1,
        "red", 2,
        "orange", 3,
        "yellow", 4,
        "green", 5,
        "blue", 6,
        "violet", 7,
        "grey", 8,
        "white", 9
    );
    
    public String label(String[] colors) {
        Integer firstDigit = colorBands.get(colors[0]);
        Integer secondDigit = colorBands.get(colors[1]);
        Integer thirdDigit = colorBands.get(colors[2]);
        
        long value = (10 * firstDigit + secondDigit) 
            * (long) Math.pow(10, thirdDigit);
        
        return formatMessage(value);
    }

    private String formatMessage(long value) {
        if (value > 1_000_000_000) {
            return String.format("%d %s", value / 1_000_000_000, "gigaohms");
        }
        if (value > 1_000_000) {
            return String.format("%d %s", value / 1_000_000, "megaohms");
        }
        if (value > 1_000) {
            return String.format("%d %s", value / 1_000, "kiloohms");
        }
        return String.format("%d %s", value, "ohms");
    }
}
