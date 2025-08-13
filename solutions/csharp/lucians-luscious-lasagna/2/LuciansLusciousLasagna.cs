class Lasagna
{
    public int ExpectedMinutesInOven() => 40;
    
    public int RemainingMinutesInOven(int actualMinutes) => 
        40 - actualMinutes;

    public int PreparationTimeInMinutes(int numberOfLayers) =>
        numberOfLayers * 2;

    public int ElapsedTimeInMinutes(int numberOfLayers, int minutesInOven) =>
        numberOfLayers * 2 + minutesInOven;
}
