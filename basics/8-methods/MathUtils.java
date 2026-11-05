public class MathUtils {

  public static void main(String[] args) {
  }

  public static int max(int a, int b) {
    if(a >= b) return a;
    else return b;
  }

  public static int max(int a, int b, int c) {
    if(a >= b && a >= c) return a;
    else if( b >= a && b >= c) return b;
    else return c;
  }

  public static int max(int... values) {
    int max = Integer.MIN_VALUE;

    if(values.length == 0) return max;

    for(int i = 0; i < values.length; i++) {
      if (values[i] > max) max = values[i];
    }

    return max;
  }

  public static boolean isPrime(int n) {

    if(n < 2) return false;

    double nSqrt = Math.floor(Math.sqrt(n));

    for(int i = 2; i <= nSqrt; i++) {
      if (n % i == 0) return false;
    }

    return true;
  }

  public static int gcd(int a, int b) {
    return 0;
  }

  public static long power(int base, int exponent) {
    return 0;
  }

  public static int fibonacci(int n) {
    return 0;
  }

}
