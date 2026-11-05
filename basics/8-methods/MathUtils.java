public class MathUtils {

  public static void main(String[] args) {
    System.out.println(fibonacci(8));
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

    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }

    if (a < 0) a *= -1;
    return a;
  }

  public static long power(int base, int exponent) {
    long powered = 1;

    if (exponent < 0) return -1;

    for(int i = 0; i < exponent; i++) {
      powered *= base;
    };

    return powered;
  }

  public static int fibonacci(int n) {
    if (n == 1) return 1;
    if (n == 0) return 0;
    if (n < 0) return -1;

    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
