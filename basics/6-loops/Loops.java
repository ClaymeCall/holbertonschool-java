public class Loops {

  public static void main(String[] args) {

    for(int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%3d", i*j);
      }
      System.out.println();
    }
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

  public static String triangle(int height) {
    if (height < 1) return "";

    StringBuilder triangle = new StringBuilder();

    for (int i = 1; i <= height; i++) {

      for (int j = 0; j < i; j++) {
        triangle.append("*");
      }

      if (i != height) triangle.append("\n");
    }

    return triangle.toString();
  }

  public static int countDigits(int n) {
    int count = 0;

    do {
      count++;
      n = n / 10;
    }
    while (n != 0);
    return count;
  }

  public static int collatzSteps(long n) {
    int steps = 0;

    if (n < 1) return -1;

    while(n != 1) {
      if (n % 2 == 0) n = n/2;
      else n = 3 * n + 1;

      steps++;
    }

    return steps;
  }
}
