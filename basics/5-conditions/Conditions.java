public class Conditions {

  public static void main(String[] args) {
  }

  public static String fizzBuzz(int n) {
    StringBuilder output = new StringBuilder();

    if (n % 5 == 0 || n % 3 == 0 ) {
      if (n % 3 == 0 ) output.append("Fizz");
      if (n % 5 == 0 ) output.append("Buzz");
    }
    else return output.append(n).toString();

    return output.toString();
  }

    public static String grade(int score) {
        return null;
    }

    public static void main(String[] args) {
    }
}
