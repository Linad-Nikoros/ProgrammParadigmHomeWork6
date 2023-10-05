package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {6, 19, 27, 28, 33, 166};
        int valueToFind = 6;
        System.out.printf("Index = %d%n", binarySearch(array, valueToFind, 0, array.length - 1));
    }
    private static int binarySearch(int[] sortedArray, int valueToFind, int min, int max) {
        int index = -1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (sortedArray[mid] < valueToFind) {
                min = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                max = mid - 1;
            } else if (sortedArray[mid] == valueToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }
}