package hw2_21000703_phanvanthanh.execrise1;

public class InsertionSort implements Sort{
    private long swapCount;
    private long comparisonCount;
    @Override
    public void sort(int[] array) {
        for(int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j = i;
            while(j > 0 && array[j - 1] > key) {
                ++comparisonCount;
                array[j] = array[j - 1];
                ++swapCount;
                j = j - 1;
            }
            array[j] = key;
            ++swapCount;
        }
    }
    public long getComparisonCount() {
        return comparisonCount;
    }
    public long getSwapCount() {
        return swapCount;
    }
}