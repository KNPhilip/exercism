public final class Lasagna {
    private final int preparationTime = 40;
    
    public int expectedMinutesInOven() {
        return preparationTime;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        return preparationTime - minutesInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return preparationTimeInMinutes(layers) + minutesInOven;
    }
}
