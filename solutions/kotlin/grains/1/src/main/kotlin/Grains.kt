import java.math.BigInteger

object Board {
    fun getTotalGrainCount(): BigInteger {
        return getTotalGrainCount(1, BigInteger.ZERO)
    }

    private tailrec fun getTotalGrainCount(number: Int, total: BigInteger): BigInteger =
        when {
            number > 64 -> total
            else -> getTotalGrainCount(number + 1, total + getGrainCountForSquare(BigInteger.ONE, number, 1))
        }

    fun getGrainCountForSquare(square: Int): BigInteger {
        require(square in 1..64) {
            "The square should be inbetween 1 and 100."
        }
        return getGrainCountForSquare(BigInteger.ONE, square, 1)
    }

    private tailrec fun getGrainCountForSquare(grains: BigInteger, maxSquare: Int, count: Int): BigInteger = 
        when {
            count == maxSquare -> grains
            else -> getGrainCountForSquare(grains + grains, maxSquare, count + 1)
        }
}
