package hw2_21000703_phanvanthanh.execrise2;

public class InsertionSort<T extends Comparable<T>> implements Sort<T> {
    private long swapCount;
    private long comparisonCount;
    public void sort(T[] array) {
        for(int i = 1; i < array.length; ++i) {
            T key = array[i];
            int j = i;
            while(j > 0 && array[j - 1].compareTo(key) > 0) {
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
