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

  public static String dayType(int day) {
    String answer = "";

    switch(day) {
      case 1:
        answer = "weekday";
        break;
      case 2:
        answer = "weekday";
        break;
      case 3:
        answer = "weekday";
        break;
      case 4:
        answer = "weekday";
        break;
      case 5:
        answer = "weekday";
        break;
      case 6:
        answer = "weekend";
        break;
      case 7 :
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

}
