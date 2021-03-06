public class ArrayDemo {

    int[] arr2;

    ArrayDemo() {
        arr2 = new int[]{2, 4, 6, 8, 10, 12}; // instance member
    }

    public void printArray() {
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    public void reverseArray() {
        // write code to reverse the elements in array (instance member)
        // this is NOT reverse print, you have to write a loop
        // to reverse the elements, Do not use "reverse" API if available in SDK

        for (int i = 0; i < arr2.length / 2; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        ArrayDemo finalArray = new ArrayDemo();
        finalArray.printArray(); // before reversal print
        finalArray.reverseArray(); // this will reverse the elements and modify it so
        finalArray.printArray(); // this will print the array after reverse
    }

}