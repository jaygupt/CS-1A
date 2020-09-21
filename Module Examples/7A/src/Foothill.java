import java.util.Scanner;

public class Foothill {
   static Scanner input = new Scanner(System.in);

   public static void main(String[] args) {
      // variables to capture input
      String userName;
      double userTemp;
      int userId;

      Patient p1 = new Patient();
      Patient p2 = new Patient();

      System.out.println("Patient #1 ---");
      userName = getPatientName();
      userTemp = getPatientTemp();
      userId = getPatientID();

      // set patient #1
      if ( !p1.setName(userName) )
         System.out.println("Error in patient name: Invalid length.");
      if ( !p1.setId(userId) )
         System.out.println("Error in patient id: out of range.");
      if ( !p1.setTemperature(userTemp) )
         System.out.println("Error in patient temperature:  out of range.");

      // get the info for patient #2:
      System.out.println( "Patient #2 ---") ;

      // we built three helper methods for this
      userName = getPatientName();
      userId = getPatientID();
      userTemp = getPatientTemp();

      // set patient #2
      if ( !p2.setName(userName) )
         System.out.println("Error in patient name: Invalid length.");
      if ( !p2.setId(userId) )
         System.out.println("Error in patient id: out of range.");
      if ( !p2.setTemperature(userTemp) )
         System.out.println("Error in patient temperature:  out of range.");

      p1.display();
      p2.display();
   }

   static String getPatientName() {
      String name;
      System.out.print("What's the patient's name? ");
      name = input.nextLine();

      return name;
   }

   static int getPatientID() {
      int id;
      String idAsString;

      System.out.print("What's the patient's id #? ");
      idAsString = input.nextLine();

      id = Integer.parseInt(idAsString);
      return id;
   }

   static double getPatientTemp() {
      double temp;
      String tempAsString;

      System.out.print("What's the patient's temperature? ");
      tempAsString = input.nextLine();

      temp = Double.parseDouble(tempAsString);
      return temp;
   }
}
