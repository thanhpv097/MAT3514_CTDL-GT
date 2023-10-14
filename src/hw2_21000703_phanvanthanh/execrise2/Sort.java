package hw2_21000703_phanvanthanh.execrise2;

public interface Sort<T extends Comparable<T>> {
    void sort(T[] array);
    long getComparisonCount();
    long getSwapCount();
}
