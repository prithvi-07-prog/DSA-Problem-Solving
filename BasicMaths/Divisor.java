package BasicMaths;
import java.util.Arrays;

class Divisor {
    public int[] divisors(int n) {
        int[] arr = new int[n];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[count] = i;
                count++;
            }
        }

        return Arrays.copyOf(arr, count);
    }
}