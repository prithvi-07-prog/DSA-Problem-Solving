package BasicMaths;

class CountOddDigits{
public int CountOdd(int n) {
    
        n = Math.abs(n);
        int count = 0;
        
        while (n > 0) {
            int ld = n % 10;
            if (ld % 2 != 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
}
}