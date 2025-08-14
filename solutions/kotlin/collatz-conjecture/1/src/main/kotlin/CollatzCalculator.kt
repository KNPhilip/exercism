object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        require(start > 0) {
            "Input number must be positive."
        }

        return computeStepCount(start, 0)
    }

    private tailrec fun computeStepCount(n: Int, count: Int): Int = 
        when {
            n == 1 -> count
            n.isEven() -> computeStepCount(n / 2, count + 1)
            else -> computeStepCount(n * 3 + 1, count + 1)
        }

    private fun Int.isEven() = this % 2 == 0
}
