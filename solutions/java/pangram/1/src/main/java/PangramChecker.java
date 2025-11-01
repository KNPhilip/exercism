public final class PangramChecker {
    public boolean isPangram(String input) {
        boolean result = input
            .toLowerCase()
            .chars()
            .filter(x -> x >= 'a' && x <= 'z')
            .distinct()
            .count() == 26;

        return result;
    }
}
