package hw2_21000703_phanvanthanh.execrise1;


import java.util.Random;
import java.util.Scanner;

public class SortedArray {
    private Sort sort;
    private int[] array;
    private int[] arraySc;
    private int[] arrayCopy;
    public void setSort(Sort sort) {
        this.sort = sort;
    }
    public void setArray(int N) {
        this.array = new int[N];
    }
    public void createArraySc(int N) {
        Scanner sc = new Scanner(System.in);
        arraySc = new int[N];
        System.out.println("Enter the number in array: ");
        for(int i = 0; i < N; ++i){
            arraySc[i] = sc.nextInt();
        }
    }
    public int[] getArraySc() {
        return arraySc;
    }
    public void createArray() {
        for(int i = 0; i < array.length; ++i) {
            Random random = new Random(i);
            array[i] = random.nextInt();
        }
    }
    public void setArrayCopy() {
        arrayCopy = getArray().clone();
    }
    public void setArrayScCopy() {
        arrayCopy = getArraySc().clone();
    }
    public int[] getArrayCopy() {
        return arrayCopy;
    }
    public int[] getArray() {
        return array;
    }
    public void sort(int[] array) {
        sort.sort(array);
    }
    public long swapCount() {
        return sort.getSwapCount();
    }
    public long comparisonCount() {
        return sort.getComparisonCount();
    }
}
