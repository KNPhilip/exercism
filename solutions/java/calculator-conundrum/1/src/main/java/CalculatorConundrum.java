public final class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalArgumentException, IllegalOperationException {
        try {
            String result = Integer.toString(operand1) + " " + operation + " " + Integer.toString(operand2) + " = ";
    
            switch (operation) {
                case "+":
                    result += operand1 + operand2;
                    break;
                case "*":
                    result += operand1 * operand2;
                    break;
                case "/":
                    result += operand1 / operand2;
                    break;
                case "":
                    throw new IllegalArgumentException("Operation cannot be empty");
                case null:
                    throw new IllegalArgumentException("Operation cannot be null");
                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            };
            return result;
        } catch (ArithmeticException ex) {
            throw new IllegalOperationException("Division by zero is not allowed", ex);
        }
    }
}
