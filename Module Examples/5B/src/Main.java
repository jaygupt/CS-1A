public class Main {
   public static void main(String[] args) {
      displayTemperature(98.8);
      System.out.println();
      displayTemperature("99.4");
      System.out.println();
      sayThanks();
      System.out.println();
      sayThanks("I just wanted to tell you how much we enjoyed the movie.");
   }

   static void displayTemperature(double temp) {
      System.out.println("The patient's temperature is: " + temp);
   }

   static void displayTemperature(String temp) {
      System.out.println("The patient's temperature is: " + temp);
   }

   static void sayThanks() {
      System.out.println("Thank you!");
   }

   static void sayThanks(String special_note) {
      System.out.println(special_note);
      sayThanks();
   }
}
