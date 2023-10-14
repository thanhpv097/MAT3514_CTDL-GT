package hw2_21000703_phanvanthanh.execrise1;

public class QuickSort implements Sort{
    private long swapCount;
    private long comparisonCount;
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }
    public void quickSort(int[] array, int low, int high) {
        if(low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
    public int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for(int j = low; j < high; ++j) {
            ++comparisonCount;
            if(array[j] < pivot) {
                ++i;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                ++swapCount;
            }
        }
        int temp = array[i+1];
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
