public static class RotationalCipher
{
    private static Dictionary<char, int> lowerPositions = new Dictionary<char, int>()
    {
        { 'a', 0 },
        { 'b', 1 },
        { 'c', 2 },
        { 'd', 3 },
        { 'e', 4 },
        { 'f', 5 },
        { 'g', 6 },
        { 'h', 7 },
        { 'i', 8 },
        { 'j', 9 },
        { 'k', 10 },
        { 'l', 11 },
        { 'm', 12 },
        { 'n', 13 },
        { 'o', 14 },
        { 'p', 15 },
        { 'q', 16 },
        { 'r', 17 },
        { 's', 18 },
        { 't', 19 },
        { 'u', 20 },
        { 'v', 21 },
        { 'w', 22 },
        { 'x', 23 },
        { 'y', 24 },
        { 'z', 25 }
    };

    private static Dictionary<char, int> upperPositions = new Dictionary<char, int>()
    {
        { 'A', 0 },
        { 'B', 1 },
        { 'C', 2 },
        { 'D', 3 },
        { 'E', 4 },
        { 'F', 5 },
        { 'G', 6 },
        { 'H', 7 },
        { 'I', 8 },
        { 'J', 9 },
        { 'K', 10 },
        { 'L', 11 },
        { 'M', 12 },
        { 'N', 13 },
        { 'O', 14 },
        { 'P', 15 },
        { 'Q', 16 },
        { 'R', 17 },
        { 'S', 18 },
        { 'T', 19 },
        { 'U', 20 },
        { 'V', 21 },
        { 'W', 22 },
        { 'X', 23 },
        { 'Y', 24 },
        { 'Z', 25 }
    };
        
    private static List<string> lowerAlphabet = ["a", "b", "c", "d", "e", "f", "g", "h", "i",
                                       "j", "k", "l", "m", "n", "o", "p", "q", "r",
                                       "s", "t", "u", "v", "w", "x", "y", "z"];

    private static List<string> upperAlphabet = ["A", "B", "C", "D", "E", "F", "G", "H", "I",
                                       "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                                       "S", "T", "U", "V", "W", "X", "Y", "Z"];
    
    public static string Rotate(string text, int shiftKey)
    {
        string returning = "";
        foreach (char character in text)
        {
            if (IsIgnoredCharacter(character))
            {
                returning += character;
                continue;
            }
            if (IsUpperCase(character))
            {
                int charIndex = upperPositions[character];
                int index = CalculateIndexFrom(charIndex, shiftKey);
                returning += upperAlphabet[index];
            }
            else
            {
                int charIndex = lowerPositions[character];
                int index = CalculateIndexFrom(charIndex, shiftKey);
                returning += lowerAlphabet[index];
            }
        }
        return returning;
    }

    private static bool IsIgnoredCharacter(char character) 
    {
        return character == ' ' || character == '1' || character == '2'
            || character == '3' || character == '4' || character == '5'
            || character == '6' || character == '7' || character == '8'
            || character == '9' || character == '0' || character == '.'
            || character == ',' || character == '!' || character == '\'';
    }

    private static bool IsUpperCase(char character)
    {
        return upperAlphabet.Contains(character.ToString());
    }

    private static int CalculateIndexFrom(int charIndex, int shiftKey)
    {
        int index = charIndex + shiftKey;
        if (index > 25)
            return index - 26;
        return index;
    }
}