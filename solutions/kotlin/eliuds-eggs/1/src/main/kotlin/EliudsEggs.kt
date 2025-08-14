object EliudsEggs {
    fun eggCount(number: Int): Int {
        var count = 0
        var n = number
        
        while (n > 0) {
            if (n % 2 == 1) {
                count++
            }
            n /= 2
        }
        
        return count
    }
}
