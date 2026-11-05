public class ArrayTools {

  public static void main(String[] args) {
  }

  public static int max(int[] t) {
    int max = t[0];

    for(int i = 1; i < t.length; i++) {
      if (t[i] > max) max = t[i];
    }
    return max;
  }

  public static int min(int[] t) {
    int min = t[0];

    for(int i = 1; i < t.length; i++) {
      if (t[i] < min) min = t[i];
    }
    return min;
  }

  public static double average(int[] t) {
    double sum = 0;

    for(int i = 0; i < t.length; i++) {
      sum += t[i];
    }
    return sum/t.length;
  }

}
