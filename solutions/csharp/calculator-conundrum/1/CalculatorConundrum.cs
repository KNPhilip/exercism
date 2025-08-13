public static class SimpleCalculator
{
    public static string Calculate(int operand1, int operand2, string? operation)
    {
        ArgumentNullException.ThrowIfNull(operation);
        ArgumentException.ThrowIfNullOrEmpty(operation);
        
        if (operation == "/" && operand2 == 0)
            return "Division by zero is not allowed.";
        
        return operation switch
        {
            "+" => $"{operand1} + {operand2} = {operand1 + operand2}",
            "-" => $"{operand1} - {operand2} = {operand1 - operand2}",
            "/" => $"{operand1} / {operand2} = {operand1 / operand2}",
            "*" => $"{operand1} * {operand2} = {operand1 * operand2}",
            _ => throw new ArgumentOutOfRangeException()
        };
    }
}
