/*
Output:

stations[ 0 ]abc
stations[ 1 ]cbs
stations[ 2 ]nbc
stations[ 3 ]fox
a,b,c,
c,b,s,
n,b,c,
f,o,x,
*/
public class ForStatements {
   public static void main(String[] args) {
      // String array of 4 different stations
      String[] stations = { "abc", "cbs", "nbc", "fox"};

      // O(n)
      // This block of code prints out two things: the station name, and how
      // that station is accessed (by writing stations[integer of station])
      for (int i = 0; i < stations.length; i++)
         System.out.println("stations[ " + i + " ]" + stations[i]);

      // O(n squared)
      // this outer for loop loops through each station in stations array
      for (int i = 0; i < stations.length; i++) {

         // this inner for loop prints out each letter in the particular
         // station name, followed by a comma
         for (int j = 0; j < stations[i].length(); j++)
            // it does this by first accessing the station name, and then the
            // character at each place in the name
            System.out.print(stations[i].charAt(j) +",");

         // this print line statement separates the stations from each other;
         // resulting in each station having its own line
         System.out.println();
      }
   }
}