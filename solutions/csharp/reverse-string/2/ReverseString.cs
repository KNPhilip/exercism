public static class ReverseString
{
    public static string Reverse(string input)
    {
        char[] chars = input.ToCharArray();
        return new string(chars.Reverse().ToArray());
    }
}