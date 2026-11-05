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

}
