package hw2_21000703_phanvanthanh.execrise4.p41;

public class BubbleSort {
    public void bubbleSort(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            boolean isSwap = false;
            for(int j = 0; j < array.length - i - 1; ++j) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap) return;
        }
    }
}
