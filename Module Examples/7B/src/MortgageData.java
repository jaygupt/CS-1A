public class MortgageData {
   private double principal;
   private double rate;
   private double years;

   static final double MIN_LOAN = 1;
   static final double MAX_LOAN = 100000000;
   static final double MIN_RATE = .00001;
   static final double MAX_RATE = 25;
   static final double MIN_YRS = 1;
   static final double MAX_YRS = 100;

   public MortgageData() {
      // default values
      setPrincipal(MIN_LOAN);
      setRate(MIN_RATE);
      setYears(MIN_YRS);
   }

   public MortgageData(double principal, double rate, double years) {
      if (!setPrincipal(principal)) {
         // if it fails
         setPrincipal(MIN_LOAN);
      }
      if (!setRate(rate)) {
         setRate(MIN_RATE);
      }
      if (!setYears(years)) {
         setYears(MIN_YRS);
      }
   }

   public boolean setRate(double rate) {
      if (rate < MIN_RATE || rate > MAX_RATE) {
         return false;
      }
      this.rate = rate;
      return true;
   }

   public double getRate() {
      return rate;
   }

   public boolean setPrincipal(double principal) {
      if (principal < MIN_LOAN || principal > MAX_LOAN) {
         return false;
      }
      this.principal = principal;
      return true;
   }

   public double getPrincipal() {
      return principal;
   }

   public boolean setYears(double years) {
      if (years < MIN_YRS || years > MAX_YRS) {
         return false;
      }
      this.years = years;
      return true;
   }

   public double getYears() {
      return years;
   }
}
