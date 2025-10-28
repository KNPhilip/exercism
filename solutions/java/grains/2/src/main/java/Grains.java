import java.math.BigInteger;

public final class Grains {
    public BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64)
            throw new IllegalArgumentException("square must be between 1 and 64");
        
        return BigInteger.valueOf(2).pow(square - 1);
    }

    public BigInteger grainsOnBoard() {
        return BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
    }
}
