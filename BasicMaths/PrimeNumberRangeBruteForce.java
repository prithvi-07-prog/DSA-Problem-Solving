class PrimeNumberRangeBruteForce {
    public int countPrimes(int n) {
        if(n==0||n==1)    return 0;
        int p=0;
        for(int i=1; i<n; i++){
            int count=0;
        for(int j=1; j<=i; j++){
            if(i%j==0){
                count++;
            }
           
        }
         if(count==2)  p++;
    
        }
        return p;
    }
}