public class Recursion {
    public static void main(String[] args) {
        System.out.println("\n----- The Fibonacci Sequence -----\n");

        for (int i = 0; i < 11; i++) {
            System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
        }
    }

    public static int fibonacci(int index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return fibonacci(index - 2) + fibonacci(index - 1);
        }
    }
}
