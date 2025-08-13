static class Badge
{
    public static string Print(int? id, string name, string? department)
    {
        string idString = id is null ? "" : $"[{id}] - ";
        return idString + $"{name} - {(department ?? "OWNER").ToUpper()}";
    }
}
