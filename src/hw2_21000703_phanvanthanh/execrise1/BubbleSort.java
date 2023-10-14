package hw2_21000703_phanvanthanh.execrise1;

public class BubbleSort implements Sort{
    private long swapCount;
    private long comparisonCount;
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            boolean isSwap = false;
            for (int j = 0; j < array.length - i - 1; ++j) {
                ++comparisonCount;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    ++swapCount;
                    isSwap = true;
                }
            }
            if (!isSwap) return;
        }
    }
    public long getComparisonCount() {
        return comparisonCount;
    }
    public long getSwapCount() {
        return swapCount;
    }

}
