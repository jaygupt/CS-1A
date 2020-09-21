class Employee {
   // member data - no static in front, as a result, they are "instance members"
   private int socSec;
   private int age;

   private void clearSocSec() {
      socSec = 000000000;
   }

   public boolean setAge(int a) {
      // don't allow negative age
      if (a < 0) {
         return false;
      } else {
         age = a;
         return true;
      }
   }

   public boolean setSS(int ss) {
      // don't allow negative ss #
      if (ss < 0) {
         return false;
      } else {
         socSec = ss;
         return true;
      }
   }

   public boolean getOlder() {
      if (age++ > 147) {
         clearSocSec();
         return false;
      } else {
         return true;
      }
   }
}
