public final class RaindropConverter {
    private String sound = "";

    public String convert(int number) {
        if (number % 3 == 0)
            sound += "Pling";
        
        if (number % 5 == 0)
            sound += "Plang";
        
        if (number % 7 == 0)
            sound += "Plong";
        
        return sound.length() == 0
            ? String.valueOf(number) : sound;
    }
}
