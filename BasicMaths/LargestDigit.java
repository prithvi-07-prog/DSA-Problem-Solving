package BasicMaths;
class Solution {
    public int largestDigit(int n) {
        int max=0;
        while(n>0){
            int ld=n%10;
            max=Math.max(max,ld);
            n=n/10;
        }
        return max;
    }
}