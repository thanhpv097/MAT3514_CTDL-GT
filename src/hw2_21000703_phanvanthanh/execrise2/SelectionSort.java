package hw2_21000703_phanvanthanh.execrise2;

public class SelectionSort<T extends Comparable<T>> implements Sort<T>{
    private long swapCount;
    private long comparisonCount;
    public void sort(T[] array) {
        for(int i = 0; i < array.length - 1; ++i) {
            int minIndex = i;
            for(int j = i + 1; j < array.length; ++j) {
                if(array[minIndex].compareTo(array[j]) > 0) {
                    ++comparisonCount;
                    minIndex = j;
                }
            }
            T temp = array[i];
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
