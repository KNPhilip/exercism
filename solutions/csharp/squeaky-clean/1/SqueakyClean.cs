using System;
using System.Text;
using System.Linq;

public static class Identifier
{
    public static string Clean(string identifier)
    {
        string[] parts = identifier
            .Replace(" ", "_")
            .Replace("\0", "CTRL")
            .Split("-");
        
        string returning = parts[0] + string.Concat(parts.Skip(1)
            .Select(word => char.ToUpper(word[0]) + word.Substring(1)));
        
        return RemoveNonLettersAndGreekLowercase(returning);
    }

    private static string RemoveNonLettersAndGreekLowercase(string input)
    {
        StringBuilder result = new StringBuilder();

        foreach (char c in input)
        {
            if (char.IsLetter(c) && !IsGreekLowercase(c) || c == '_')
            {
                result.Append(c);
            }
        }

        return result.ToString();
    }

    private static bool IsGreekLowercase(char c)
    {
        // Unicode range for Greek lowercase letters: U+03B1 to U+03C9 (α to ω)
        return c >= '\u03B1' && c <= '\u03C9';
    }
}
