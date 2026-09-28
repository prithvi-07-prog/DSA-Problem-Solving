package BasicMaths;
class ArmstrongNumber {
    public static  boolean isArmstrong(int n) {
        if(n==0)  return false;
        int count=0;
        int temp=n;
        int sum=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        n=temp;
        while(n!=0){
            int ld=n%10;
            sum+=Math.pow(ld,count);
            n=n/10;
        }
        return sum==temp;
    }

  }