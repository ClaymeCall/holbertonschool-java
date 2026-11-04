public class Strings {

  public static void main(String[] args){
    System.out.println(countWords(args[0]));
  }

  public static String capitalize(String s){

    String lowerCaseString = s.toLowerCase();
    String capitalizedString = lowerCaseString.substring(0, 1).toUpperCase() + lowerCaseString.substring(1);

    System.out.println(capitalizedString);

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
}
