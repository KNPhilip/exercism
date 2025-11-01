public final class PangramChecker {
    public boolean isPangram(String input) {
        boolean result = input
            .toLowerCase()
            .chars()
            .filter(Character::isLetter)
            .distinct()
            .count() == 26;

        return result;
    }
}
