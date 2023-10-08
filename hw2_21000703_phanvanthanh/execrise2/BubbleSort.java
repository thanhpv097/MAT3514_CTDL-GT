package hw2_21000703_phanvanthanh.execrise2;

public class BubbleSort<T extends Comparable<T>> implements Sort<T>{
    private long swapCount;
    private long comparisonCount;
    public void sort(T[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            boolean isSwap = false;
            for (int j = 0; j < array.length - i - 1; ++j) {
                ++comparisonCount;
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    ++swapCount;
                    isSwap = true;
                }
            }
            if (!isSwap) return;
        }
    }

    @Override
    public long getComparisonCount() {
        return comparisonCount;
    }

    @Override
    public long getSwapCount() {
        return swapCount;
    }
}
