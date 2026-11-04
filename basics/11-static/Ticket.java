public class Ticket {

    public static final String PREFIX = "TCK-";

    private static int nextId = 1;

    private final int id;

    public Ticket() {
        this.id = 0;
    }

    public int getId() {
        return 0;
    }

    public String getCode() {
        return null;
    }

    public static int getTotalTickets() {
        return 0;
    }

    public static boolean isValidCode(String code) {
        return false;
    }
}
