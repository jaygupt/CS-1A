public class Question_Three {
   public static void main(String[] args) {
      multiply(5, 6);
      multiply(2.5, 1.5);
      multiply(2, 7, 3);
      multiply(1.5, 2.5, 3.5);
   }

   public static void multiply (int x, int y) {
      System.out.println(x * y);;
   }

   public static void multiply (double x, double y) {
      System.out.println(x * y);;
   }

   public static void multiply (int x, int y, int z) {
      System.out.println(x * y * z);;
   }

   public static void multiply (double x, double y, double z) {
      System.out.println(x * y * z);;
   }
}
