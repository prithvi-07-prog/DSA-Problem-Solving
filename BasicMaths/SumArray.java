package BasicMaths;
class SumArray {
  public  int sum(int arr[], int n) {
    int ans=0;
      for(int i=0; i<arr.length; i++){
          ans+=arr[i];
      }
       return ans;
    }
   
}
