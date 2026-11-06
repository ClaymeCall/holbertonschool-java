public class Ticket {

  public static final String PREFIX = "TCK-";

  private static int nextId = 1;

  private final int id;

  public Ticket() {
    this.id = nextId;
    nextId++;
  }

  public int getId() {
    return this.id;
  }

  public String getCode() {
    return PREFIX + String.format("%04d", this.id);
  }

  public static int getTotalTickets() {
    return nextId - 1;
  }

  public static boolean isValidCode(String code) {
    if (code == null || code.length() != PREFIX.length() + 4) {
      return false;
    }
    if (!code.startsWith(PREFIX)) {
      return false;
    }
    for (int i = PREFIX.length(); i < code.length(); i++) {
      char c = code.charAt(i);
      if (c < '0' || c > '9') {
        return false;
      }
    }
    return true;
  }
}
