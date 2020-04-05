
import java.util.stream.IntStream;

public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int firstInRow = 1;
        for (int i = 0; i < n; i++) {
            firstInRow += (i) * 2;
        }
        return IntStream.iterate(firstInRow, i->i+2).limit(n).sum();
    }
}

