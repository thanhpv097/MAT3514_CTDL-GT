package hw2_21000703_phanvanthanh.execrise2;

public class QuickSort<T extends Comparable<T>> implements Sort<T>{
    private long swapCount;
    private long comparisonCount;
    public void sort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }
    public void quickSort(T[] array, int low, int high) {
        if(low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
    public int partition(T[] array, int low, int high) {
        T pivot = array[high];
        int i = low - 1;
        for(int j = low; j < high; ++j) {
            ++comparisonCount;
            if(array[j].compareTo(pivot) < 0) {
                ++i;
                T temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                ++swapCount;
            }
        }
        T temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        ++swapCount;
        return i+1;
    }

    public long getComparisonCount() {
        return comparisonCount;
    }

    public long getSwapCount() {
        return swapCount;
    }
}
