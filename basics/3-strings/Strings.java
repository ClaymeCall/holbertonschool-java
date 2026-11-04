public class Strings {

  public static void main(String[] args){
    System.out.println(isPalindrome(args[0]));
  }

  public static String capitalize(String s){

    if (s == null || s.isEmpty()) {
      return "";
    }

    String lowerCaseString = s.toLowerCase();
    String capitalizedString = lowerCaseString.substring(0, 1).toUpperCase() + lowerCaseString.substring(1);

    return capitalizedString;
  }

  public static int countWords(String s){

    String[] arrayOfWords= s.trim().split(" ");

    int count = 0;

    for (int i=0; i < arrayOfWords.length; i++) {
      if (!arrayOfWords[i].equals("")) {
        count++;
      }
    }

    return count;
  }

  public static boolean isPalindrome(String s) {

    String processedString = s.trim().replace(" ", "").toLowerCase();
    String reversedString = "";

    for(int i = 0;  i < processedString.length(); i++){
      reversedString = processedString.charAt(i) + reversedString;
    }

    return  processedString.equals(reversedString);
  }
}
