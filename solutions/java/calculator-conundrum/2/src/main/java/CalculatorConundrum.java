public final class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) 
    throws IllegalArgumentException, IllegalOperationException {
        int result = 0;

        switch (operation) {
            case "+":
                result = operand1 + operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = divide(operand1, operand2);
                break;
            case "":
                throw new IllegalArgumentException("Operation cannot be empty");
            case null:
                throw new IllegalArgumentException("Operation cannot be null");
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        };
        return String.format("%d %s %d = %d", operand1, operation, operand2, result);
    }

    private int divide(int operand1, int operand2) {
        try {
            return operand1 / operand2;
        } catch (ArithmeticException ex) {
            throw new IllegalOperationException("Division by zero is not allowed", ex);
        }
    }
}
