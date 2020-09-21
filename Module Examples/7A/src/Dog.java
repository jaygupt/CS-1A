public class Dog {
   private static long population = 0;
   long licenseNumber;

   public Dog() {
      population++;
   }

   public void setLicenseNumber(long licenseNumber) {
      this.licenseNumber = licenseNumber;
   }

   public long getLicenseNumber() {
      return licenseNumber;
   }

   public static long getPopulation() {
      return population;
   }
}
