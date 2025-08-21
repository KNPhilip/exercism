class Dna(val dna: String) {
    init {
        require(dna.all { it in "ACGT" })
    }
    
    val nucleotideCounts get() = 
        mapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0) + dna.groupingBy { it }.eachCount()
}
