public class StringAPI {
   public static void main(String[] args) {
      String assignedString = new String("Java versus C++ Programming");
      // a.
      System.out.println(assignedString.charAt(5));
      System.out.println(assignedString.charAt(17));

      // b.
      System.out.println(assignedString.substring(5, 6));
   }
}

/*
Output:
v
r
v

Process finished with exit code 0
 */