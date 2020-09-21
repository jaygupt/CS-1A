public class ComputerScienceCourse {
   // instance data members
   private int courseNumber;
   private String courseTitle;
   private double numberOfUnits;
   private String prerequisites;

   // static constants
   public static final int DEFAULT_COURSE_NUMBER = 0;
   public static final String DEFAULT_COURSE_TITLE = "Unknown";
   public static final double DEFAULT_UNITS = 1;
   public static final String DEFAULT_PREREQUISITES = "None";

   public static final int MIN_COURSE_NUMBER = 0;
   public static final int MAX_COURSE_NUMBER = 500;

   public static final int MIN_LENGTH = 5;
   public static final int MAX_LENGTH = 50;

   public static final double MIN_UNITS = 0.5;
   public static final double MAX_UNITS = 6;

   public static final int MIN_PREREQUISITES_LENGTH = 0;
   public static final int MAX_PREREQUISITES_LENGTH = 10;

   // course counter (How many computer science courses in our catalog?)
   public static int numberOfCourses = 0;

   // default constructor
   ComputerScienceCourse() {
      courseNumber = DEFAULT_COURSE_NUMBER;
      courseTitle = DEFAULT_COURSE_TITLE;
      numberOfUnits = DEFAULT_UNITS;
      prerequisites = DEFAULT_PREREQUISITES;

      numberOfCourses++;
   }

   // full constructor (4 parameters)
   ComputerScienceCourse(int courseNumber, String courseTitle,
                         double numberOfUnits, String prerequisites) {
      if (!setCourseNumber(courseNumber)) {
         this.courseNumber = DEFAULT_COURSE_NUMBER;
      }

      if (!setCourseTitle(courseTitle)) {
         this.courseTitle = DEFAULT_COURSE_TITLE;
      }

      if (!setNumberOfUnits(numberOfUnits)) {
         this.numberOfUnits = DEFAULT_UNITS;
      }

      if (!setPrerequisites(prerequisites)) {
         this.prerequisites = DEFAULT_PREREQUISITES;
      }

      numberOfCourses++;
   }

   // Accessors
   public int getCourseNumber() {
      return courseNumber;
   }

   public String getCourseTitle() {
      return courseTitle;
   }

   public double getNumberOfUnits() {
      return numberOfUnits;
   }

   public String getPrerequisites() {
      return prerequisites;
   }

   // mutators
   public boolean setCourseNumber(int courseNumber) {
      if (courseNumber < MIN_COURSE_NUMBER || courseNumber > MAX_COURSE_NUMBER) {
         return false;
      } else {
         this.courseNumber = courseNumber;
         return true;
      }
   }

   public boolean setCourseTitle(String courseTitle) {
      if (courseTitle.length() < MIN_LENGTH || courseTitle.length() > MAX_LENGTH) {
         return false;
      } else {
         this.courseTitle = courseTitle;
         return true;
      }
   }

   public boolean setNumberOfUnits(double numberOfUnits) {
      if (numberOfUnits < MIN_UNITS || numberOfUnits > MAX_UNITS) {
         return false;
      } else {
         this.numberOfUnits = numberOfUnits;
         return true;
      }
   }

   public boolean setPrerequisites(String prerequisites) {
      if (prerequisites.length() < MIN_PREREQUISITES_LENGTH
              || prerequisites.length() > MAX_PREREQUISITES_LENGTH) {
         return false;
      } else {
         this.prerequisites = prerequisites;
         return true;
      }
   }

   // display a course's information
   public void display() {
      System.out.println("\nCS " + courseNumber + " :: " + courseTitle + "\n" +
              "*" + numberOfUnits + " units*\n" + "Prerequisites: "  +
              prerequisites);
   }

   // return number of courses
   public static int getNumberOfCourses() {
      return numberOfCourses;
   }

   public static String greaterUnits(ComputerScienceCourse course1,
      ComputerScienceCourse course2) {
      if (course1.numberOfUnits > course2.numberOfUnits) {
         return "\nCS " + course1.getCourseNumber() + " has more units than " +
                 "CS " + course2;
      } else if (course2.numberOfUnits > course1.numberOfUnits){
         return "\nCS " + course2.getCourseNumber() + " has more units than " +
                 "CS " + course1.getCourseNumber();
      } else {
         return "\nCS " + course1.getCourseNumber() + " has the same number " +
                 "of units as CS " + course2.getCourseNumber();
      }
   }

   public static void toCreateACourse() {
      System.out.println("\nA course must have satisfy the following " +
              "conditions:\n" +
              "* Units: between " + MIN_UNITS + " and " + MAX_UNITS + "\n" +
              "* Course number: between " + MIN_COURSE_NUMBER +
              " and " + MAX_COURSE_NUMBER + "\n" +
              "* Course title's word count: between " + MIN_LENGTH + " and" +
              " " + MAX_LENGTH + "\n" +
              "* Prerequisites's word count: between " + MIN_PREREQUISITES_LENGTH + " and " +
              MAX_PREREQUISITES_LENGTH);
   }
}
