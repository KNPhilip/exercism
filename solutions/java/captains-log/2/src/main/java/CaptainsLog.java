import java.util.Random;

public final class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    public CaptainsLog(Random random) {
        this.random = random;
    }

    public char randomPlanetClass() {
        int randomIndex = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[randomIndex];
    }

    public String randomShipRegistryNumber() {
        int randomInt = 1000 + random.nextInt(9000);
        return String.format("NCC-%d", randomInt);
    }

    public double randomStardate() {
        return 41000.0 + random.nextDouble(1000.0);
    }
}
