package javaproject;

public class middlelement {
    public static <T> T getMiddleElement(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int middleIndex = array.length / 2; 
        return array[middleIndex];
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};       
        String[] strArray = {"a", "b", "c", "d"};  

        System.out.println("Middle of intArray: " + getMiddleElement(intArray));
        System.out.println("Middle of strArray: " + getMiddleElement(strArray));
    }
}
