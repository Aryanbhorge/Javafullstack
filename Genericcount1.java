package javaproject;

public class Genericcount1 {
    public static <T> int countOccurrences(T[] array, T target) {
        int count = 0;
        for (T element : array) {
            if (element == null && target == null) {
                count++;
            } else if (element != null && element.equals(target)) {
                count++;
            }
        }
        return count;
    }

    // Main method to test
    public static void main(String[] args) {
        // Test with Integer
        Integer[] intArray = {1, 2, 3, 2, 4, 2};
        System.out.println("Integer count: " + countOccurrences(intArray, 2)); // Output: 3

    }
}
