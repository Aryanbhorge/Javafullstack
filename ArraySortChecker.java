package javaproject;
public class ArraySortChecker {

    public static <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 2, 4, 5};
        String[] strArray = {"apple", "banana", "banana", "cherry"};
        Double[] doubleArray = {3.2, 4.5, 4.5, 6.0};
        Integer[] unsortedArray = {5, 3, 4};

        System.out.println("intArray sorted? " + isSorted(intArray));         
        System.out.println("strArray sorted? " + isSorted(strArray));         
        System.out.println("doubleArray sorted? " + isSorted(doubleArray));   
        System.out.println("unsortedArray sorted? " + isSorted(unsortedArray));
    }
}
