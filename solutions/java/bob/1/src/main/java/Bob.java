public final class Bob {
    public String hey(String input) {
        String trimmedInput = input.trim();

        if (trimmedInput.isEmpty())
            return "Fine. Be that way!";
        
        if (trimmedInput.toUpperCase() == trimmedInput && trimmedInput.chars().anyMatch(Character::isLetter)) {
            if (trimmedInput.endsWith("?"))
                return "Calm down, I know what I'm doing!";
            
            return "Whoa, chill out!";
        }
        if (trimmedInput.endsWith("?"))
            return "Sure.";

        return "Whatever.";
    }
}
