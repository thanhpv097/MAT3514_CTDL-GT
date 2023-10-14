package hw2_21000703_phanvanthanh.execrise6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] array = new long[N];
        for(int i = 0; i < N; ++i) {
            array[i] = sc.nextLong();
        }
        mergeSort(array, 0, array.length - 1);
        System.out.println(array[K-1]);
    }
    public static void mergeSort(long[] array, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }
    public static void merge(long[] array, int left, int mid, int right) {
        int L = mid - left + 1;
        int R = right - mid;
        long[] leftArray = new long[L];
        long[] rightArray = new long[R];
        for(int i = 0; i < L; ++i) {
            leftArray[i] = array[i+left];
        }
        for(int j = 0; j < R; ++j) {
            rightArray[j] = array[mid + j + 1];
        }
        int i = 0, j = 0;
        int k = left;
        while(i < L && j < R) {
            if(leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i++];
            } else {
                array[k] = rightArray[j++];
            }
            ++k;
        }
        while(i < L) {
            array[k++] = leftArray[i++];
        }
        while(j < R) {
            array[k++] = rightArray[j++];
        }
    }
}
