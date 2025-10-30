public final class DifferenceOfSquaresCalculator {
    public int computeSquareOfSumTo(int input) {
        int sum = input * (input + 1) / 2;
        return sum * sum;
    }

    public int computeSumOfSquaresTo(int input) {
        return input * (input + 1) * ((input * 2) + 1) / 6;
    }

    public int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
