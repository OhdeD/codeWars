public class NumberFun {
    public static long findNextSquare(long sq) {
        if (sq == (Math.pow((int)Math.pow(sq, 0.5), 2))) {
            return (long) Math.pow(Math.pow(sq, 0.5) + 1, 2);
        } else {
            return -1;
        }
    }
}
