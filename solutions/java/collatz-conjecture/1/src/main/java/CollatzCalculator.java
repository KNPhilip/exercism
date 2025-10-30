public final class CollatzCalculator {
    public int computeStepCount(int start) {
        if (start < 1)
            throw new IllegalArgumentException("Only positive integers are allowed");
        
        return computeStepCount(start, 0);
    }

    private int computeStepCount(int start, int steps) {
        if (start == 1)
            return steps;

        int next = start % 2 == 0
            ? start / 2 : start * 3 + 1;
        
        return computeStepCount(next, steps + 1);
    }
}
