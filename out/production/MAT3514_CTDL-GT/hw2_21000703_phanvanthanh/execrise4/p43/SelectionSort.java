package hw2_21000703_phanvanthanh.execrise4.p43;

public class SelectionSort {
    public void selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; ++i) {
            int minI = i;
            for(int j = i+1; j < array.length; ++j) {
                if(array[minI] > array[j]) {
                    minI = j;
                }
            }
            int temp = array[minI];
            array[minI] = array[i];
            array[i] = temp;
        }
    }
}
