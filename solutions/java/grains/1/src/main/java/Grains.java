import java.math.BigInteger;

public final class Grains {
    public BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64)
            throw new IllegalArgumentException("square must be between 1 and 64");
        
        if (square <= 2)
            return bigIntOf(square);

        BigInteger previousGrain = grainsOnSquare(square - 1);
        return previousGrain.multiply(bigIntOf(2));
    }

    public BigInteger grainsOnBoard() {
        return grainsOnSquare(64).multiply(bigIntOf(2)).subtract(bigIntOf(1));
    }

    private BigInteger bigIntOf(int n) {
        return BigInteger.valueOf(n);
    }
}
