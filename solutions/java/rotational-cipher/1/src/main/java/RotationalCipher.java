public final class RotationalCipher {
    private int shiftKey;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private String upperAlphabet = alphabet.toUpperCase();
    
    public RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }
    
    public String rotate(String data) {
        String result = "";
        
        for (int i = 0; i < data.length(); i++)
            if (alphabet.contains(data.charAt(i) + ""))
                result += alphabet.charAt((alphabet.indexOf(data.charAt(i)) + shiftKey % 26) % 26);
            else
                result += upperAlphabet.contains(data.charAt(i) + "")
                    ? upperAlphabet.charAt((upperAlphabet.indexOf(data.charAt(i)) + shiftKey % 26) % 26)
                    : data.charAt(i);
        
        return result;
    }
}
