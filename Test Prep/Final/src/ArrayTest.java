import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int array[] = new int[]{10, 11, 88, 2, 12, 120, 170};
        printEvens(array);

        // get max and min
        /*
        int max = getMax(array);
        int min = getMin(array);

        System.out.println("The max value is: " + max + ".");
        System.out.println("The min value is: " + min + ".");
         */
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int getMax(int[] inputArray) {
        int max = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > max) {
                max = inputArray[i];
            }
        }

        return max;
    }

    public static int getMin(int[] inputArray) {
        int min = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < min) {
                min = inputArray[i];
            }
        }

        return min;
    }

    public static void leftRotate(int arr[], int d) {
        for (int i = 0; i < d; i++) {
            rotateLeftByOne(arr);
        }
    }

    public static void rotateLeftByOne(int arr[]) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    public static void reversePrintArray(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void reverse(int[] input) {
        System.out.println("Original Array: " + Arrays.toString(input));

        // handling null, empty and one element arrays
        if (input == null || input.length <= 1) {
            return;
        }

        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i]; // swap numbers;
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }

        System.out.println("Reversed Array: " + Arrays.toString(input));
    }

    public static void printEvens(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
