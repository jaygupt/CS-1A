public class Test {
   public static void main(String[] args) {
      String cde = "cde";

      String sub1 = "abc".substring(1, 3); // not inclusive of 3
      String sub2 = cde.substring(1, 2);

      System.out.println(sub1 + " " + sub2);
   }
}
