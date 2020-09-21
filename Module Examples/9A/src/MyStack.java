public class MyStack {
   private static final int SIZE = 10;
   private String stck[];
   private int tos;

   public MyStack() {
      tos = 0;
      stck = new String[SIZE];
   }

   public boolean push(String item) {
      if (tos == SIZE) {
         return false;
      } else {
         stck[tos++] = new String(item);
         return true;
      }
   }

   public String pop() {
      if (tos == 0) {
         return "Stack Empty";
      } else {
         return stck[--tos];
      }
   }
}
