package hw7_21000703_phanvanthanh.execrise2;

import java.util.Arrays;
import java.util.Random;

public class SearchComparison {
    public static void main(String[] args) {
        int size1 = 1000000;

        int[] array = generateRandomArray(size1);
        int[] array1 = Arrays.copyOf(array, array.length);
        int[] array2 = Arrays.copyOf(array, array.length);
        int[] array3 = Arrays.copyOf(array, array.length);

        long startTime = System.currentTimeMillis();
        sequentialSearch(array1, array1[size1 / 2]);
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential Search (10^6): " + (endTime - startTime) + " milliseconds");

        Arrays.sort(array2);
        startTime = System.currentTimeMillis();
        binarySearch(array2, array2[size1 / 2]);
        endTime = System.currentTimeMillis();
        System.out.println("Binary Search (10^6): " + (endTime - startTime) + " milliseconds");

        BinarySearchTree bst = new BinarySearchTree();
        for (int value : array3) {
            bst.insert(value);
        }
        startTime = System.currentTimeMillis();
        bst.search(array3[size1 / 2]);
        endTime = System.currentTimeMillis();
        System.out.println("Binary Search Tree (10^6): " + (endTime - startTime) + " milliseconds");

        int size2 = 10000000;

        array = generateRandomArray(size2);
        array1 = Arrays.copyOf(array, array.length);
        array2 = Arrays.copyOf(array, array.length);
        array3 = Arrays.copyOf(array, array.length);

        startTime = System.currentTimeMillis();
        sequentialSearch(array1, array1[size1 / 2]);
        endTime = System.currentTimeMillis();
        System.out.println("Sequential Search (10^7): " + (endTime - startTime) + " milliseconds");

        Arrays.sort(array2);
        startTime = System.currentTimeMillis();
        binarySearch(array2, array2[size1 / 2]);
        endTime = System.currentTimeMillis();
        System.out.println("Binary Search (10^7): " + (endTime - startTime) + " milliseconds");

        bst = new BinarySearchTree();
        for (int value : array3) {
            bst.insert(value);
        }
        startTime = System.currentTimeMillis();
        bst.search(array3[size1 / 2]);
        endTime = System.currentTimeMillis();
        System.out.println("Binary Search Tree (10^7): " + (endTime - startTime) + " milliseconds");
    }
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size * 10);
        }
        return array;
    }
    public static void sequentialSearch(int[] array, int target) {
        for (int value : array) {
            if (value == target) {
                break;
            }
        }
    }
    public static void binarySearch(int[] array, int target) {
        Arrays.binarySearch(array, target);
    }
}
