public final class DifferenceOfSquaresCalculator {
    public int computeSquareOfSumTo(int input) {
        int sum = 0;
        
        for (int i = 1; i <= input; i++)
            sum += i;
        
        return sum * sum;
    }

    public int computeSumOfSquaresTo(int input) {
        int sumOfSquares = 0;

        for (int i = 1; i <= input; i++)
            sumOfSquares += i * i;
        
        return sumOfSquares;
    }

    public int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
