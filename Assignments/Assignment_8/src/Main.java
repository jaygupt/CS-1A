public class Main {
   public static void main(String[] args) {
      // course restraints?
      ComputerScienceCourse.toCreateACourse();

      // create ComputerScienceCourse objects
      ComputerScienceCourse java1 = new ComputerScienceCourse(254,
              "Intro to Object-Oriented Programming in Java", 4.5, "Math 105");
      ComputerScienceCourse java2 = new ComputerScienceCourse(255,
              "Intermediate Software Design in Java", 5, "254");
      ComputerScienceCourse java3 = new ComputerScienceCourse(256,
              "Advanced Data Structures and Algorithms in Java", 6, "255");
      ComputerScienceCourse defaultCourse = new ComputerScienceCourse();
      ComputerScienceCourse nonCompliantCourse =
              new ComputerScienceCourse(501, "This Course Doesn't Follow " +
                      "Course Guidelines", 6.5, "This Course has many " +
                      "prerequisites: CS 254, CS 255, CS 255");

      // display course information for each
      java1.display();
      java2.display();
      java3.display();
      defaultCourse.display();
      nonCompliantCourse.display();

      // how many courses do I have?
      System.out.println("\nThe Foothill course catalog has: " + ComputerScienceCourse.getNumberOfCourses() +
              " computer science courses.");

      // which course has the greater number of units?
      System.out.println(ComputerScienceCourse.greaterUnits(java1, java2));
      System.out.println(ComputerScienceCourse.greaterUnits(java2, java3));
      System.out.println(ComputerScienceCourse.greaterUnits(java1, java3));
      System.out.println(ComputerScienceCourse.greaterUnits(defaultCourse,
              nonCompliantCourse));
   }
}
