import java.util.Map;
import java.util.HashMap;

public final class DialingCodes {
    private Map<Integer, String> dictionary = new HashMap<>();
    
    public Map<Integer, String> getCodes() {
        return dictionary;
    }

    public void setDialingCode(Integer code, String country) {
        dictionary.put(code, country);
    }

    public String getCountry(Integer code) {
        return dictionary.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!dictionary.containsKey(code) && !dictionary.containsValue(country))
            setDialingCode(code, country);
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();
            }
        }
        return null;
    }
    
    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = findDialingCode(country);
        if (oldCode != null) {
            dictionary.remove(oldCode);
            dictionary.put(code, country);
        }
    }
}
