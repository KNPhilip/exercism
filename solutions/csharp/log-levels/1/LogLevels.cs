using System;

static class LogLine
{
    public static string Message(string logLine)
    {
        return logLine.Split(": ")[1].Replace("  \t", string.Empty)
            .Replace("  \r\n", string.Empty);
    }

    public static string LogLevel(string logLine)
    {
        return logLine.Split(":")[0].Replace("[", string.Empty).Replace("]", string.Empty).ToLower();
    }

    public static string Reformat(string logLine)
    {
        string logMessage = logLine.Split(": ")[1].Replace("\t ", string.Empty)
            .Replace("\r", string.Empty).Replace("\n", string.Empty);
        string logLevel = logLine.Split(":")[0].Replace("[", string.Empty).Replace("]", string.Empty).ToLower();
        return $"{logMessage} ({logLevel})";
    }
}
