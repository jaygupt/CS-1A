public class Test {
   public static void main(String[] args) {
      for (int n = 0; n < 10; n++) {
         System.out.println(repeat(n) + " Hello");
      }

   }

   public static String repeat(int count, String with) {
      return new String(new char[count]).replace("\0", with);
   }

   public static String repeat(int count) {
      return repeat(count, " ");
   }

}
