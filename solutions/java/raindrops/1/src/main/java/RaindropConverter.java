public final class RaindropConverter {
    public String convert(int number) {
        if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
            return String.valueOf(number);
        }
        
        String result = "";

        if (number % 3 == 0) {
            result += "Pling";
        }
        if (number % 5 == 0) {
            result += "Plang";
        }
        if (number % 7 == 0) {
            result += "Plong";
        }
        
        return result;
    }
}
