public class StaticDemo {

  public static void main(String[] args) {
    System.out.println("Before: " + Ticket.getTotalTickets());

    Ticket first = new Ticket();
    Ticket second = new Ticket();
    System.out.println(first.getCode() + " " + second.getCode());

    System.out.println("After: " + Ticket.getTotalTickets());

    // System.out.println(this);
    // StaticDemo.java:12: error: non-static variable this cannot be referenced from a static context
    //     System.out.println(this);
    //                        ^
  }
}
