import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Format {
   public static void main(String[] args) {
      String number1, number2;

      number1 = JOptionPane.showInputDialog("What is your first deposit?");
      String num1 = dollars(Double.parseDouble(number1));

      number2 = JOptionPane.showInputDialog("What is your second deposit?");
      String num2 = dollars(Double.parseDouble(number2));

   }

   public static double add(double num1, double num2) {
      return num1 + num2;
   }

   public static String dollars(double z) {
      NumberFormat tidy = NumberFormat.getCurrencyInstance(Locale.US);
      return tidy.format(z);
   }
}
