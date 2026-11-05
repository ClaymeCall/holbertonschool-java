public class ArrayTools {

  public static void main(String[] args) {

    int[] tab = {1, 2, 3, 4};

    System.out.println(tab);
    System.out.println(java.util.Arrays.toString(tab));
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

    if(t.length == 0) return 0.0;

    for(int i = 0; i < t.length; i++) {
      sum += t[i];
    }
    return sum/t.length;
  }

  public static void reverseInPlace(int[] t) {
    int buffer = 0;
    int arrLength = t.length;

    for(int i = 0; i < arrLength/2; i++) {
      buffer = t[i];
      t[i] = t[arrLength - i - 1];
      t[arrLength - i - 1] = buffer;
    }
  }

  public static int indexOf(int[] t, int value) {

    for(int i = 0; i < t.length; i++) {
      if (t[i] == value) return i;
    }
    return -1;
  }

  public static int[][] identity(int n) {
    int[][] identityMatrix = new int[n][n];

    if(n == 0) return identityMatrix;

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if( i == j) identityMatrix[i][j] = 1;
      }
    }
    return identityMatrix;
  }

  public static String format(int[][] m) {
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < m.length; i++) {
      for(int j = 0; j < m[i].length; j++) {
        sb.append(m[i][j]);
        if(j < m[i].length - 1) sb.append(" ");
      }
        
      if(i < m.length - 1) sb.append("\n");
    }

    return sb.toString();
  }
}
