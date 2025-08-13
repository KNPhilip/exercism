using System;
using System.Linq;
using System.Text.RegularExpressions;

public static class PigLatin
{
    // Thanks to GPT.
    public static string Translate(string word)
    {
        string vowels = "aeiou";

        string TranslateWord(string singleWord)
        {
            if (string.IsNullOrEmpty(singleWord))
                return singleWord;

            if (vowels.Contains(singleWord[0]) || singleWord.StartsWith("xr") || singleWord.StartsWith("yt"))
            {
                return singleWord + "ay";
            }

            var quMatch = Regex.Match(singleWord, @"^([^aeiou]*qu)(.*)");
            if (quMatch.Success)
            {
                return quMatch.Groups[2].Value + quMatch.Groups[1].Value + "ay";
            }

            var yMatch = Regex.Match(singleWord, @"^([^aeiou]+?)(y.*)");
            if (yMatch.Success)
            {
                return yMatch.Groups[2].Value + yMatch.Groups[1].Value + "ay";
            }

            var consonantMatch = Regex.Match(singleWord, @"^([^aeiou]+)(.*)");
            if (consonantMatch.Success)
            {
                return consonantMatch.Groups[2].Value + consonantMatch.Groups[1].Value + "ay";
            }

            return singleWord;
        }

        string[] words = word.Split(' ');
        for (int i = 0; i < words.Length; i++)
        {
            words[i] = TranslateWord(words[i]);
        }

        return string.Join(" ", words);
    }
}
