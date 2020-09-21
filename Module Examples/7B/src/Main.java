public class Main {
   public static void main(String[] args) {
      Dog chloe = new Dog();

      chloe.name = "Chloe of Hood Canal";
      chloe.wagsPerMinute = 30;

      Dog lily = new Dog();
      lily.name = "Lily the Waggiest";
      lily.wagsPerMinute = 75;

      System.out.println("The difference in wag frequency between " +
              lily.name + " and " + chloe.name + " is " + lily.differenceInWags(chloe));
   }

   static void promisePieceOfCarrot(Dog dog) {
      dog.wagsPerMinute *= 3;
   }
}
