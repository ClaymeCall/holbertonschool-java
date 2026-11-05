public class Conditions {

  public static void main(String[] args) {
    for (int i = 1; i <= 15; i++) {
      System.out.println(fizzBuzz(i));
    }
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

  public static String dayType(int day) {
    String answer = "";

    switch(day) {
      case 1, 2, 3, 4, 5:
        answer = "weekday";
        break;
      case 6, 7:
        answer = "weekend";
        break;
      default:
        answer = "invalid";
    }

    return answer;
  }

  public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }

  public static int daysInMonth(int month, int year) {
    return switch (month) {
      case 1, 3, 5, 7, 8, 10, 12 -> 31;
      case 4, 6, 9, 11 -> 30;
      case 2 -> isLeapYear(year) ? 29 : 28;
      default -> -1;
    };
  }

}
