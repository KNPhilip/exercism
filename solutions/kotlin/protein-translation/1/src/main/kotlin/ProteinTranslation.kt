fun translate(rna: String?): List<String> {
    if (rna.isNullOrEmpty()) {
        return emptyList()
    }

    var result: MutableList<String> = mutableListOf()
    
    val codons = rna.chunked(3).toList()

    for (codon in codons) {
        when (codon) {
            "AUG" -> result.add("Methionine")
            "UUU", "UUC" -> result.add("Phenylalanine")
            "UUA", "UUG" -> result.add("Leucine")
            "UCU", "UCC", "UCA", "UCG" -> result.add("Serine")
            "UAU", "UAC" -> result.add("Tyrosine")
            "UGU", "UGC" -> result.add("Cysteine")
            "UGG" -> result.add("Tryptophan")
            "UAA", "UAG", "UGA" -> break
            else -> throw IllegalArgumentException()
        }
    }
    
    return result
}
