public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Sample array

        System.out.println("Original Array:");
        printArray(arr);

        reverseArray(arr);

        System.out.println("Reversed Array:");
        printArray(arr);
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap the elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move start index forward and end index backward
            start++;
            end--;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
