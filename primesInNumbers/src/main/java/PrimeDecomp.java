import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeDecomp {

    public static boolean isPrimeNo(int n) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .allMatch(i -> n % i != 0);
    }

    public static String factors(int n) {
        Map<Integer, Integer> primes = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            if (isPrimeNo(i)) {
                while (n % i == 0) {
                    n /= i;
                    if (primes.containsKey(i)) {
                        primes.replace(i, primes.get(i) + 1);
                    } else {
                        primes.put((i), 1);
                    }
                }
            }
        }

        List<String> partial = new ArrayList<>();
        primes.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(a -> partial.add("(" + a.getKey() + "**" + a.getValue() + ")"));
        return String.join("", partial).replace("**1", "");
    }
}
