public class PropertyDemo {
  public static void main(String[] args) {
    Property p1 = new Property("P-001", "12 Rue de la Paix, 75002 Paris", 25, 950);
    Property p2 = new Property("P-002", "8 Chemin des Vignes, 33000 Bordeaux", 120, 1800);

    print(p1);
    print(p2);
  }

  private static void print(Property p) {
    System.out.println(p.getReference() + ": " + p.getSurface() + " m2, " + p.getMonthlyRent() + " EUR/month, " + p.getAnnualRent() + " EUR/year");
  }
}

