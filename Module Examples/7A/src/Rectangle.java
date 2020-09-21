public class Rectangle {
   private double width, height;
   public char label;

   public Rectangle() {

   }

   public boolean setWidthHeight(double width, double height) {
      if (width <= 0 || height <= 0) {
         return false; // don't allow negative or 0 width or height
      }
      this.width = width;
      this.height = height;
      return true;
   }

   // returns reference to larger Rectangle of r1 and r2
   public static Rectangle whichIsBiggerRef(Rectangle r1, Rectangle r2) {
      // def omitted - returns rectangle with larger area
      double r1Area = r1.width * r1.height;
      double r2Area = r2.width * r2.height;

      if (r1Area > r2Area) {
         return r1;
      } else {
         return r2;
      }
   }

   static public Rectangle whichIsBiggerClone(Rectangle r1, Rectangle r2) {
      Rectangle returnRect = new Rectangle();

      Rectangle r;
      r = whichIsBiggerRef(r1, r2);

      returnRect.width = r.width;
      returnRect.height = r.height;
      returnRect.label = '*';

      return returnRect;
   }

   public double getWidth() {
      return width;
   }

   public double getHeight() {
      return height;
   }

   public double getArea() {
      return width * height;
   }

   public double getPerimeter() {
      return (width * 2) + (height * 2);
   }

   public void showAllData() {
      System.out.println("Label = " + label + " Width = " + width +
              " Height = " + height);
   }

}
