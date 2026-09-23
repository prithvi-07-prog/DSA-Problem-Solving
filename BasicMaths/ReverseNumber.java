package BasicMaths;

public class ReverseNumber {

  public int reverse(int x) {
    int rev = 0;
    while (x != 0) {
      int ld = x % 10;
      rev = rev * 10 + ld;
      x = x / 10;
    }
    return rev;
  }
}
