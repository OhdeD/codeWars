import java.util.stream.IntStream;

public class SquareSum {

    public SquareSum() {
    }

    public static int squareSum(int[] n) {
       return IntStream.of(n)
                .map(a -> a * a)
                .sum();
    }
}
