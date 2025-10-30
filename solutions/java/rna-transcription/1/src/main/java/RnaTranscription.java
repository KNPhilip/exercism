import java.util.List;
import java.util.ArrayList;

public final class RnaTranscription {
    public String transcribe(String dnaStrand) {
        StringBuilder builder = new StringBuilder();

        for (char character : dnaStrand.toCharArray())
            switch (character) {
                case 'G':
                    builder.append('C');
                    break;
                case 'C':
                    builder.append('G');
                    break;
                case 'T':
                    builder.append('A');
                    break;
                case 'A':
                    builder.append('U');
                    break;
            };
        return builder.toString();
    }
}
