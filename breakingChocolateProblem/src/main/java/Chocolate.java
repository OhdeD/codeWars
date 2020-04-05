public class Chocolate {
    public static int breakChocolate(int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        return m * n - 1;
    }
}
