import java.util.Arrays;

public class Solution {

    public static int solve(int[] arr) {
        int daycounter = 0;
        boolean chipsLeft = true;
        while (chipsLeft) {
            Arrays.sort(arr);
            if (arr[1] == 0) {
                chipsLeft = false;
            }
            int halfMax = (int) Math.ceil((double) arr[2] / 2.0);
            if (halfMax >= arr[1]) {
                arr[2] -= arr[1];
                daycounter += arr[1];
                arr[1] = 0;
            } else {
                arr[2] -= halfMax;
                arr[1] -= halfMax;
                daycounter += halfMax;
            }
        }
        return daycounter;
    }
}