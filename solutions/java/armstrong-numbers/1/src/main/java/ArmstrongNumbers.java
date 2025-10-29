public final class ArmstrongNumbers {
    public boolean isArmstrongNumber(int numberToCheck) {
        String numberAsString = Integer.toString(numberToCheck);
        int numOfDigits = numberAsString.length();
        int sum = 0;

        for (char charDigit : numberAsString.toCharArray())
            sum += Math.pow(charDigit - '0', numOfDigits);
            
        return numberToCheck == sum;
    }
}
