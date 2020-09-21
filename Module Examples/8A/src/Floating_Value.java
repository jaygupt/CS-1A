import javax.swing.*;

public class Floating_Value {
   public static void main(String[] args) {
      String[] myArray = {"martin", "claudia", "sandra", "samuels",
      "terry", "jack", "clark", "palmer", "abraham", "Mike"};

      // TODO: Put method calls here
      printArray("Before: ", myArray);
      arraySort(myArray);
      printArray("After: ", myArray);
   }

   // returns true if a modification was made to array
   public static boolean floatLargestToTop(String[] data) {
      boolean changed = false;
      String temp;

      for (int k = 0; k < data.length - 1; k++) {
         // TODO: Understand why 'data length - 1'
         if (data[k].compareToIgnoreCase(data[k + 1]) > 0) {
            temp = data[k];
            data[k] = data[k + 1];
            data[k + 1] = temp;
            changed = true;
         }
      }

      return changed;
   }

   // print out array with string as a title for message box
   public static void printArray (String title, String[] data) {
      String output = "";

      for (int k = 0; k < data.length; k++) {
         output += " " + data[k];
      }
      JOptionPane.showMessageDialog(null, output, title,
              JOptionPane.OK_OPTION);
   }

   public static void arraySort(String[] array) {
      int everShrinkingTop;

      for (everShrinkingTop = array.length - 1; everShrinkingTop > 0; everShrinkingTop--) {
         if (!floatLargestToTop(array)) {
            return;
         }
      }
   }
}
