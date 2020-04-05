import java.util.*;
import java.util.stream.Collectors;

public class Digitize {

    public static int[] digitize(long n) {
        List<Integer> list = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        int[] table = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            table[i] = list.get(list.size() - (i + 1));
        }
        return table;
    }
}
