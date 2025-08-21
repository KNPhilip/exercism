import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class SqueakyClean {
    public static String clean(String identifier) {
        String underscoredString = identifier.replace(' ', '_');
        String camelCasedString = convertKebabToCamelCase(underscoredString);
        String normalizedString = convertFromLeetspeak(camelCasedString);
        String lettersOnlyString = normalizedString.replaceAll("[^a-zA-Z_]", "");
        
        return lettersOnlyString;
    }

    private static String convertKebabToCamelCase(String identifier) {
        Matcher matcher = Pattern.compile("-(\\w)").matcher(identifier);
        StringBuffer sb = new StringBuffer();
        
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        
        matcher.appendTail(sb);
        
        return sb.toString();
    }

    private static String convertFromLeetspeak(String identifier) {
        return identifier.replace('4', 'a')
                         .replace('3', 'e')
                         .replace('0', 'o')
                         .replace('1', 'l')
                         .replace('7', 't');
    }
}
