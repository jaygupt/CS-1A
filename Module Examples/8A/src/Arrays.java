import javax.swing.*;

public class Arrays {
   public static void main(String[] args) {
      String[] student = new String[20];
      int value = 0;
      String strValue;
      String newName;

      // initialize the array
      for (int k = 0; k < student.length; k++) {
         student[k] = "undefined";
      }

      // infinite loop until user enters q or cancels
      while (true) {
         // input filter loop to get a valid array index from user
         while (true) {
            strValue = JOptionPane.showInputDialog("Choose a student to edit\n" +
                    "from 0 to " + (student.length - 1) + "\n" +
                    " ('q' to end program):");

            // did they click cancel/close box?
            if (strValue == null) {
               return; // end program
            }

            // did they type a string that was not 1 or 2 digits
            if (strValue.length() < 1 || strValue.length() > 2) {
               continue; // prompt again
            }

            // did they type 'q'?
            if (strValue.length() == 1 && strValue.charAt(0) =='q') {
               return; // exit program
            }

            // convert to int. Is valid int?
            try {
               value = Integer.parseInt(strValue);
            }
            catch (NumberFormatException e) {
               // typed illegal int
               continue;
            }

            // is the int within expected range
            if (value >= 0 && value < student.length) {
               break;
            }
         }

         // infinite loop for name input
         while (true) {
            newName = JOptionPane.showInputDialog(null,
                    "Enter New Name:", "Editing student " +
                            + value + ": " + student[value] + "",
                    JOptionPane.QUESTION_MESSAGE);

            // they cancel/close box
            if (newName == null) {
               break;
            } else if (newName.length() >= 2 && newName.length() <= 40) {
               // user-inputted name should be between 2 and 40 characters,
               // inclusive.
               student[value] = newName;
               break;
            } else {
               JOptionPane.showMessageDialog(null, "Invalid Name, try again.");
            }
         }
      }
   }
}
