import javax.swing.*;

public class StudentArrayUtilities {
   // print the array with string as a title for the message box
   public static void printArray(String title, Student[] data) {
      String output = "";

      // build the output string from the individual Students:
      for (int k = 0; k < data.length; k++) {
         output += "" + data[k].toString();
      }

      // now put it in a JOptionPane
      JOptionPane.showMessageDialog(null, output, title, JOptionPane.OK_OPTION);
   }

   // returns true if a modification was made to the array
   private static boolean floatLargestToTop(Student[] data, int top) {
      boolean changed = false;
      Student temp;

      // compare with client call to see where the loop stops
      for (int k = 0; k < top; k++)
         if (Student.compareTwoStudents(data[k], data[k + 1]) > 0 )
         {
            temp = data[k];
            data[k] = data[k + 1];
            data[k + 1] = temp;
            changed = true;
         }
      return changed;
   }

   // public callable arraySort() - assumes Student class has a compareTo()
   public static void arraySort(Student[] array) {
      for (int k = 0; k < array.length; k++) {
         // compare with method def to see where inner loop stops
         if (!floatLargestToTop(array, array.length - 1 - k)) {
            return;
         }
      }
   }
}
