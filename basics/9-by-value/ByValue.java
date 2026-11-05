import java.util.Arrays;

public class ByValue {

  public static void main(String[] args) {
    System.out.println(demoPrimitive());
    System.out.println(Arrays.toString(demoArrayContent()));
    System.out.println(Arrays.toString(demoArrayReassign()));
  }

  public static void doubleIt(int x) {
    x *= 2;
  }

  public static void fillWithZeros(int[] t) {
    for(int i = 0; i < t.length; i++){
      t[i] = 0;
    }
  }

  public static void swapInArray(int[] t, int i, int j) {
    int buffer = t[i];
    t[i] = t[j];
    t[j] = buffer;
  }

  public static void replaceArray(int[] t) {
    int[] replacement = {9, 9, 9};
    t = replacement;
  }

  public static int demoPrimitive() {
    int n = 10;
    doubleIt(n);
    return n;
  }

  public static int[] demoArrayContent() {
    int [] array = {1, 2, 3};
    fillWithZeros(array);
    return array;
  }

  public static int[] demoArrayReassign() {
    int[] array = {1, 2, 3};
    replaceArray(array);
    return array;
  }
}
