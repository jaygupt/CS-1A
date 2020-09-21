public class Dog {
   public String name;
   public int wagsPerMinute;

   public int differenceInWags(Dog otherDog) {
      return wagsPerMinute - otherDog.wagsPerMinute; 
   }
}
