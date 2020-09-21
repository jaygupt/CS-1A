public class Main {
    public static void main(String[] args) {
        System.out.println(myPow(2.4, -2) + " vs " + Math.pow(2.4, -2));
        System.out.println( myPow(1.23, 9) + " vs. "
                + Math.pow(1.23, 9));
        System.out.println( myPow(5535, -29) + " vs. "
                + Math.pow(5535, -29));
    }

    public static double myPow(double base, long exp) {
        if (exp == 0) {
            return 1;
        } else if (exp < 0) {
            return 1.0 / myPow(base, -exp);
        } else {
            return base * myPow(base, exp - 1);
        }
    }
}
