public class Main {
   public static void main(String[] args) {
      Employee birkoff, walter; // references, not objects yet
      int a, b;

      // allocate and initialize Walter
      walter = new Employee();
      walter.socSec = 123456789;
      walter.wage = 12.95;
      walter.age = 61;

      // initialize a
      a = 89;

      // assign to birkoff
      birkoff = walter; // they are pointing to the same object

      // assign a to b
      b = a;

      System.out.println("a: " + a + "\nb: " + b);

      System.out.println("walter: ss#-> " + walter.socSec +
              " walter: wage-> " + walter.wage +
              " walter: age-> " + walter.age);

      System.out.println("birkoff: ss#-> " + birkoff.socSec +
              " birkoff: wage-> " + birkoff.wage +
              " birkoff: age-> " + birkoff.age);

      a++;
      walter.age = (short)(walter.age - 40);
      walter.socSec ++ ;
      walter.wage ++ ;

      System.out.println("a: " + a + "\nb: " + b);

      // show both walter and birkoff after changing walter:
      System.out.println( "walter: ss#->" + walter.socSec
              + " wage->"+ walter.wage
              + " age->"+ walter.age );
      System.out.println( "birkoff: ss#->" + birkoff.socSec
              + " wage->"+ birkoff.wage
              + " age->"+ birkoff.age );
   }
}
