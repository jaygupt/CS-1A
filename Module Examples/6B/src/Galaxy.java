public class Galaxy {
   // member data
   private String name;
   private double magnitude;

   // static constants
   public static final double DEFAULT_MAG = 0.0;
   public static final String DEFAULT_NAME = "undefined";
   public static final double MIN_MAG = -3.0;
   public static final double MAX_MAG = 30.0;
   public static final int MIN_STR_LEN = 2;

   // default constructor
   Galaxy() {
      name = DEFAULT_NAME;
      magnitude = DEFAULT_MAG;
   }

   // 2-parameter constructor
   Galaxy(String myName, double myMag) {
      if (!setName(myName)) {
         name = DEFAULT_NAME;
      }

      if (!setMagnitude(myMag)) {
         magnitude = DEFAULT_MAG;
      }
   }

   // accessor set method
   public boolean setMagnitude(double mag) {
      if (mag < MIN_MAG || mag > MAX_MAG) {
         return false;
      }
      magnitude = mag;
      return true;
   }

   public boolean setName(String theName) {
      if (theName == null || theName.length() < MIN_STR_LEN) {
         return false;
      }
      name = theName;
      return true;
   }

   // accessor "get" methods
   public String getName() {
      return name;
   }
   public double getMagnitude() {
      return magnitude;
   }
}