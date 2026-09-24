package BasicMaths;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int rev=0;
        int temp=x;
        while(temp>0){
            int ld=temp%10;
            rev=(rev*10)+ld;
            temp=temp/10;
        }
        if(x==rev)    return true;
        else    return false;
 
    }
}
