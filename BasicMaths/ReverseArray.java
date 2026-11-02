package BasicMaths;
class ReverseArray {
    public void reverse(int[] arr, int n) {
     int left=0;
     int right=arr.length-1;
     while(left<right){
         int t=arr[left];
         arr[left]=arr[right];
         arr[right]=t; 
         left++;
         right--;
    }
    }
}

