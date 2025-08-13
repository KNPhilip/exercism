object Bob {
    fun hey(input: String): String {
        val trimmedInput: String = input.trim()
        
        if (trimmedInput.isSilence())
            return "Fine. Be that way!"
        if (trimmedInput.isYell()) {
            if (input.isQuestion())
                return "Calm down, I know what I'm doing!"
            return "Whoa, chill out!"
        }
        if (trimmedInput.isQuestion())
            return "Sure."
        
        return "Whatever."
    }

    private fun String.isSilence() = this == ""
    private fun String.isYell() = any(Char::isLetter) && toUpperCase() == this
    private fun String.isQuestion() = this.last() == '?'
}
