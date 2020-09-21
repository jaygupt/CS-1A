public class Foothill {
   public static void main(String[] args) {
      Contact client1 = new Contact("Evariste Galois", "650-949-7000");
      Contact client2 = new Contact("Michael Faraday", "949-1234");
      Contact client3 = new Contact("Clerk Maxwell", "(213)555123");

      Dial(client1);
      Dial(client2);
      Dial(client3);
   }

   public static void Dial(Contact object) {
      System.out.println("Dial " + object.getPhone() + " to reach " + object.getName());
   }
}