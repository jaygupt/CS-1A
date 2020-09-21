class Frequency
{
   private long count[];
   private int size;
   private static int MAX_SIZE = 10000;

   public Frequency(int size)
   {
      if (size < 0 || size > MAX_SIZE)
         size = MAX_SIZE;

      this.size = size;
      count = new long[size];  // automatically sets to all 0s
   }

   public long get(int index)
   {
      if (index >= 0 && index < size)
         return count[index];
      else
         return -1;
   }
   public void increment(int index)
   {
      if (index >= 0 && index < size)
         count[index]++;
   }

   public void decrement(int index)
   {
      if (index >= 0 && index < size)
         if (count[index] > 0)
            count[index]--;
   }
}