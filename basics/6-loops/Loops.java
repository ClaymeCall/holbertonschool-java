public class Loops {

  public static void main(String[] args) {
  }

  public static int sumTo(int n) {
    int sum = 0;

    for(int i=0; i <= n; i++) {
      sum += i;
    }

    return sum;
  }

  public static long factorial(int n) {

    if (n < 0 || n > 20) {
      return -1;
    }
    long result = 1;

    for (int i = 2; i <= n; i ++) {
      result  *= i;
    }

    return result;
  }

}
