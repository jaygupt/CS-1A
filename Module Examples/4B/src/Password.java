import java.util.Scanner;
/*
      pass:
         first character must be a letter
         must use only A-Z, a-z, or 0-9
      At the end, must say {user password} accepted.
*/

public class Password {
   public static void main(String[] args) {
      while (true) {
         boolean isValid = true;
         Scanner input = new Scanner(System.in);
         System.out.print("Please enter your password (q to quit): ");
         // user's password stored in variable: password
         String password = input.nextLine();

         int length = password.length();

         // check for spaces
         for (int i = 0; i < length; i++) {
            if (password.charAt(i) == ' ') {
               isValid = false;
               break;
            }
         }

         // check for first character being anything other than a letter
         // if first letter isn't a-z or A-Z, isValid = false
         // first, what is: between a-z or A-Z
         char firstLetter = password.charAt(0);
         if ((firstLetter >= 'a' && firstLetter <= 'z') || (firstLetter >= 'A' && firstLetter <= 'Z')) {
            System.out.println(firstLetter + " is a letter.");
         } else {
            System.out.println(firstLetter + " isn't a letter.");
            isValid = false;
         }

         // go even further. If password is less than 6 characters, tell the
         // user. If greater than 15, tell the user...
         if ((password.toLowerCase()).charAt(0) == 'q' && length == 1) {
            System.out.println("Quit.");
            break;
         } else if (length < 6) {
            System.out.println("Sorry, your password was rejected. It must have " +
                    "at least 6 characters.\n");
            isValid = false;
         } else if (length > 15) {
            System.out.println("Sorry, your password was rejected. It must be " +
                    "less than 15 characters.\n");
            isValid = false;
         }

         if (isValid) {
            System.out.println("Your password, '" + password + "' is valid.");
            break;
         }
      }
   }
}