import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase == "") return null;
        phrase.trim();
        phrase.toLowerCase();
        String[] singleWords = phrase.split(" ");
        return Arrays.stream(singleWords)
                .map(a -> a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}