object Isogram {
    fun isIsogram(input: String): Boolean {
        val lowerLetters: List<Char> = input.toLowerCase().filter(Char::isLetter).toList()
        return lowerLetters.distinct().count() == lowerLetters.count()
    }
}
