package hw2_21000703_phanvanthanh.execrise1;

public class MergeSort implements Sort{
    private long swapCount;
    private long comparisonCount;
    public void sort(int[] array){
        mergeSort(array, 0, array.length - 1);
    }
    public void mergeSort(int[] array, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);
            merge(array, left, mid, right);
        }
    }
    public void merge(int[] array, int left, int mid, int right) {
        int L = mid - left + 1;
        int R = right - mid;
        int[] leftArray = new int[L];
        int[] rightArray = new int[R];
        for(int i = 0; i < L; ++i) {
            leftArray[i] = array[left + i];
        }
        for(int j = 0; j < R; ++j) {
            rightArray[j] = array[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k =left;
        while(i < L && j < R) {
            if(leftArray[i] <= rightArray[j]) {
                ++comparisonCount;
                array[k] = leftArray[i];
                ++swapCount;
                ++i;
            } else {
                ++comparisonCount;
                array[k] = rightArray[j];
                ++swapCount;
                ++j;
            }
            ++k;
        }
        while(i < L) {
            array[k] = leftArray[i];
            ++swapCount;
            ++k;
            ++i;
        }
        while(j < R) {
            array[k] = rightArray[j];
            ++swapCount;
            ++k;
            ++j;
        }
    }
    public long getComparisonCount() {
        return comparisonCount;
    }

    public long getSwapCount() {
        return swapCount;
    }
}
