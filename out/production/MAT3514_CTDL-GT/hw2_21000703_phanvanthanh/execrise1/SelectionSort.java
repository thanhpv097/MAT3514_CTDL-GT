package hw2_21000703_phanvanthanh.execrise1;

public class SelectionSort implements Sort{
    private long swapCount;
    private long comparisonCount;
    public void sort(int[] array) {
        for(int i = 0; i < array.length - 1; ++i) {
            int minIndex = i;
            for(int j = i + 1; j < array.length; ++j) {
                if(array[minIndex] > array[j]) {
                    ++comparisonCount;
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
            ++swapCount;
        }
    }
    public long getComparisonCount(){
        return comparisonCount;
    }
    public long getSwapCount() {
        return swapCount;
    }
}
