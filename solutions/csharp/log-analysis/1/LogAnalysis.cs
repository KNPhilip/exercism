using System;

public static class LogAnalysis 
{
    // TODO: define the 'SubstringAfter()' extension method on the `string` type
    public static string SubstringAfter(this string givenString, string stringSplit) {
        return givenString.Split(stringSplit)[1];
    }

    // TODO: define the 'SubstringBetween()' extension method on the `string` type
    public static string SubstringBetween(this string givenString, string firstStringSplit, string secondStringSplit) {
        string firstSplit = givenString.Split(firstStringSplit)[1];
        return firstSplit.Split(secondStringSplit)[0];
    }
    
    // TODO: define the 'Message()' extension method on the `string` type
    public static string Message(this string givenString) {
        return givenString.Replace("[WARNING]: ", string.Empty);
    }

    // TODO: define the 'LogLevel()' extension method on the `string` type
    public static string LogLevel(this string givenString) {
        return givenString.SubstringBetween("[", "]");
    }
}