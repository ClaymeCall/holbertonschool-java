public class Scope {

  public static void main(String[] args) {
    Counter counter = new Counter();

    for(int i = 0; i < 3; i++) {
      counter.increment();
    }

    counter.describe();
  }
}
