import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] myArray = new int[]{10, 11, 88, 2};

        reverseArray(myArray);
    }

    public static void reversePrint(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }

    public static void reverseArray(int[] arr) {
        System.out.println("Original Array: " + Arrays.toString(arr));

        if (arr == null || arr.length <= 1) {
            return;
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
