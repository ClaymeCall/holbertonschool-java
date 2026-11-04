public class StringTraps {
  public static void main(String[] args) {
  }

  public static boolean sameContent(String a, String b) {
    if (a == null || b == null) {
      return a == b;
    }

    return a.equals(b);
  }

  public static boolean sameObject(String a, String b) {
    return a == b;
  }

  public static String repeat(String s, int times, String separator) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < times; i++) {
      if (i > 0) {
        sb.append(separator);
      }
      sb.append(s);
    }

    return sb.toString();
  }

  public static String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
  }

  public static String buildSlow(int n) {
    String builtString = "";

    for (int i = 0; i < n; i++) {
      builtString += (char) ('a' + i % 26);
    }

    return builtString;
  }

  public static String buildFast(int n) {
    StringBuilder sb = new StringBuilder(n);

    for (int i = 0; i < n; i++) {
      sb.append((char) ('a' + i % 26));
    }

    return sb.toString();
  }
}
