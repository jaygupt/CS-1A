import javax.swing.*;

public class HelloGui {
   public static void main(String[] args) {
      // Declare a String reference to hold user's answer
      String userAnswer;

      // ask the ?, hold the answer
      userAnswer = JOptionPane.showInputDialog("What high school did you " +
              "attend? ");

      if (userAnswer.equals("")) {
         JOptionPane.showMessageDialog(null, "What, you didn't go to high " +
                 "school? ");
      } else {
         JOptionPane.showMessageDialog(null,
                 "Really? You went to " + userAnswer +
                 "? You must know Don Cutter!");
      }
   }
}
