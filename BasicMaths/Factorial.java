package BasicMaths;
class factorial {
    public int factN(int n) {
        if(n==0)    return 1;
        int fact=1;
        for(int i=1; i<=n; i++){
             fact*=i;
        }
        return fact;
    }
}