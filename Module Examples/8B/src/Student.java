public class Student {
   // instance variables
   private String lastName;
   private String firstName;
   int totalPoints;

   // static constant variables
   public static final String DEFAULT_NAME = "zz-error";
   public static final int DEFAULT_POINTS = 0;
   public static final int MAX_POINTS = 1000;

   // constructor requires parameters - no default supplied
   public Student(String lst, String fst, int pts) {
      if (!setLastName(lst)) {
         // if it fails, set last name to default
         lastName = DEFAULT_NAME;
      }
      if (!setFirstName(fst)) {
         firstName = DEFAULT_NAME;
      }
      if (!setPoints(pts)) {
         totalPoints = DEFAULT_POINTS;
      }
   }

   // get methods
   public String getLastName() {
      return lastName;
   }

   public String getFirstName() {
      return firstName;
   }

   public int getTotalPoints() {
      return totalPoints;
   }

   // set methods
   public boolean setLastName(String last) {
      if (!validString(last)) {
         return false;
      } else {
         lastName = last;
         return true;
      }
   }

   public boolean setFirstName(String first) {
      if (!validString(first)) {
         return false;
      } else {
         firstName = first;
         return true;
      }
   }

   public boolean setPoints(int pts) {
      if (!validPoints(pts)) {
         return false;
      } else {
         totalPoints = pts;
         return true;
      }
   }

   public static int compareTwoStudents(Student firstStud, Student secondStud) {
      int result;

      // this particular version based on last name only (case insensitive)
      result = firstStud.lastName.compareToIgnoreCase(secondStud.lastName);

      return result;
   }

   public String toString() {
      String resultString;

      resultString =
              "" + lastName + ", " + firstName + " points: " + totalPoints +
                      "\n";
      return resultString;
   }

   // more methods, but what should they be?
   private static boolean validString(String testStr) {
      if (testStr != null && Character.isLetter(testStr.charAt(0))) {
         return true;
      }
      return false;
   }

   private static boolean validPoints(int testPoints) {
      if (testPoints >= DEFAULT_POINTS && testPoints <= MAX_POINTS) {
         return true;
      } else {
         return false;
      }
   }
}
