package hw2_21000703_phanvanthanh.execrise4.p42;

public class InsertionSort {
    public void insertionSort(int[] array) {
        for(int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j = i;
            while(j > 0 && array[j - 1] > key) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = key;
        }
    }
}
