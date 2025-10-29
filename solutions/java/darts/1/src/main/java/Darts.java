public final class Darts {
    public int score(double xOfDart, double yOfDart) {
        double radius = Math.sqrt((xOfDart * xOfDart) + (yOfDart * yOfDart));
        
        if (radius <= 1)
            return 10;
        if (radius <= 5)
            return 5;
        if (radius <= 10)
            return 1;
        else
            return 0;
    }
}
