package hw2_21000703_phanvanthanh.execrise4.p43;

public class Main {
    public static void main(String[] args) {
        int[] array = {3,2,1,3,4,5};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(array);
        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }
}
