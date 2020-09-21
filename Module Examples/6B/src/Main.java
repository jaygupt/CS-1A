public class Main {
   public static void main(String[] args) {
      /*
      // declare the references
      Galaxy gal1, gal2;
      Galaxy gal3, gal4;

      // instantiate the objects
      gal1 = new Galaxy();
      gal2 = new Galaxy();

      // try to set the data
      gal1.setName("x");
      gal1.setMagnitude(100);

      gal2.setName("Stephan's Third");
      gal2.setMagnitude(13.2);

      // results...
      System.out.println("\nGal #1 name: " + gal1.getName());
      System.out.println("Gal #1 mag: " + gal1.getMagnitude());

      System.out.println("\nGal #2 name: " + gal2.getName());
      System.out.println("Gal #2 mag: " + gal2.getMagnitude());

      gal3 = new Galaxy("M1", 8.9);
      gal4 = new Galaxy("Andromeda", 3.5);

      System.out.println("\nGal #3 name: " + gal3.getName());
      System.out.println("Gal #3 mag: " + gal3.getMagnitude());

      System.out.println("\nGal #4 name: " + gal4.getName());
      System.out.println("Gal #4 mag: " + gal4.getMagnitude());
       */
      Employee walter;
      int k;

      walter = new Employee();

      walter.setSS(123456789);
      walter.setAge(140);

      for (k = 0; k < 14; k++)
         if (walter.getOlder()) {
            System.out.println("Happy Birthday!");
         } else {
            System.out.println("You must be dead.  I have given"
                    + " your social security number"
                    + " to someone else.");
         }
   }
}
