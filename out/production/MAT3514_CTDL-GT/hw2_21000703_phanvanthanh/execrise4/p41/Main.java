package hw2_21000703_phanvanthanh.execrise4.p41;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,4,0,3};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
