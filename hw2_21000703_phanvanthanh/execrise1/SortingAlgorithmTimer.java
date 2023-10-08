package hw2_21000703_phanvanthanh.execrise1;

import java.util.Scanner;

public class SortingAlgorithmTimer {
    public static int[] size;
    public static int numberOfLoop;
    private double[] aveBubbleSort = new double[100000];
    private double[] aveSelectionSort = new double[100000];
    private double[] aveInsertSort = new double[100000];
    private double[] aveQuickSort = new double[100000];
    private double[] aveMergeSort = new double[100000];
    private long totalBubbleSortTime = 0;
    private long totalSelectionSortTime = 0;
    private long totalInsertionSortTime = 0;
    private long totalQuickSortTime = 0;
    private long totalMergeSortTime = 0;

    private long durationBubbleSort;
    private long durationSelectionSort;
    private long durationInsertSort;
    private long durationQuickSort;
    private long durationMergeSort;
    public void timeSort() {
        Scanner sc = new Scanner(System.in);
        SortedArray sortedArray = new SortedArray();
        sortedArray.createArraySc(5);

        sortedArray.setArrayScCopy();
        sortedArray.setSort(new BubbleSort());
        sortedArray.sort(sortedArray.getArrayCopy());
        System.out.println("SwapCountBubbleSort: " + sortedArray.swapCount());
        System.out.println("ComparisonCountBubbleSort: " + sortedArray.comparisonCount());

        sortedArray.setArrayScCopy();
        sortedArray.setSort(new SelectionSort());
        sortedArray.sort(sortedArray.getArrayCopy());
        System.out.println("SwapCountSelectionSort: " + sortedArray.swapCount());
        System.out.println("ComparisonCountSelectionSort: " + sortedArray.comparisonCount());

        sortedArray.setArrayScCopy();
        sortedArray.setSort(new InsertionSort());
        sortedArray.sort(sortedArray.getArrayCopy());
        System.out.println("SwapCountInsertionSort: " + sortedArray.swapCount());
        System.out.println("ComparisonCountInsertionSort: " + sortedArray.comparisonCount());

        sortedArray.setArrayScCopy();
        sortedArray.setSort(new QuickSort());
        sortedArray.sort(sortedArray.getArrayCopy());
        System.out.println("SwapCountQuickSort: " + sortedArray.swapCount());
        System.out.println("ComparisonCountQuickSort: " + sortedArray.comparisonCount());

        sortedArray.setArrayScCopy();
        sortedArray.setSort(new MergeSort());
        sortedArray.sort(sortedArray.getArrayCopy());
        System.out.println("SwapCountMergeSort: " + sortedArray.swapCount());
        System.out.println("ComparisonCountMergeSort: " + sortedArray.comparisonCount());

        System.out.print("Enter the number of loop: " );
        numberOfLoop = sc.nextInt();
        size = new int[numberOfLoop];
        for(int i = 0; i < numberOfLoop; ++i) {
            System.out.println("Enter the number of Array: ");
            size[i] = sc.nextInt();
            sortedArray.setArray(size[i]);
            sortedArray.createArray();
            for(int j = 0; j < 20; ++j) {
                sortedArray.setArrayCopy();
                long startTimeBubbleSort = System.nanoTime();
                sortedArray.setSort(new BubbleSort());
                sortedArray.sort(sortedArray.getArrayCopy());
                System.out.println("SwapCountBubbleSort: " + sortedArray.swapCount());
                System.out.println("ComparisonCountBubbleSort: " + sortedArray.comparisonCount());
                long endTimeBubbleSort = System.nanoTime();
                durationBubbleSort = endTimeBubbleSort - startTimeBubbleSort;
                totalBubbleSortTime += durationBubbleSort;

                sortedArray.setArrayCopy();
                long startTimeSelectionSort = System.nanoTime();
                sortedArray.setSort(new SelectionSort());
                sortedArray.sort(sortedArray.getArrayCopy());
                System.out.println("SwapCountSelectionSort: " + sortedArray.swapCount());
                System.out.println("ComparisonCountSelectionSort: " + sortedArray.comparisonCount());
                long endTimeSelectionSort = System.nanoTime();
                durationSelectionSort = endTimeSelectionSort - startTimeSelectionSort;
                totalSelectionSortTime += durationSelectionSort;

                sortedArray.setArrayCopy();
                long startTimeInsertionSort = System.nanoTime();
                sortedArray.setSort(new InsertionSort());
                sortedArray.sort(sortedArray.getArrayCopy());
                System.out.println("SwapCountInsertionSort: " + sortedArray.swapCount());
                System.out.println("ComparisonCountInsertionSort: " + sortedArray.comparisonCount());
                long endTimeInsertionSort = System.nanoTime();
                durationInsertSort = endTimeInsertionSort - startTimeInsertionSort;
                totalInsertionSortTime += durationInsertSort;

                sortedArray.setArrayCopy();
                long startTimeQuickSort = System.nanoTime();
                sortedArray.setSort(new QuickSort());
                sortedArray.sort(sortedArray.getArrayCopy());
                System.out.println("SwapCountQuickSort: " + sortedArray.swapCount());
                System.out.println("ComparisonCountQuickSort: " + sortedArray.comparisonCount());
                long endTimeQuickSort = System.nanoTime();
                durationQuickSort = endTimeQuickSort - startTimeQuickSort;
                totalQuickSortTime += durationQuickSort;

                sortedArray.setArrayCopy();
                long startTimeMergeSort = System.nanoTime();
                sortedArray.setSort(new MergeSort());
                sortedArray.sort(sortedArray.getArrayCopy());
                System.out.println("SwapCountMergeSort: " + sortedArray.swapCount());
                System.out.println("ComparisonCountMergeSort: " + sortedArray.comparisonCount());
                long endTimeMergeSort = System.nanoTime();
                durationMergeSort = endTimeMergeSort - startTimeMergeSort;
                totalMergeSortTime += durationMergeSort;
            }
            aveBubbleSort[i] = (double) totalBubbleSortTime / 20;
            aveSelectionSort[i] = (double) totalSelectionSortTime / 20;
            aveInsertSort[i] = (double) totalInsertionSortTime / 20;
            aveQuickSort[i] = (double) totalQuickSortTime / 20;
            aveMergeSort[i] = (double) totalMergeSortTime / 20;
        }
        for(int i = 0; i < numberOfLoop; ++i) {
            System.out.println("Average time of Bubble Sort with N = " + size[i] + ": " + aveBubbleSort[i]);
            System.out.println("Average time of Selection Sort with N = " + size[i] + ": " + aveSelectionSort[i]);
            System.out.println("Average time of InsertionSort with N = " + size[i] + ": " + aveInsertSort[i]);
            System.out.println("Average time of Quick Sort with N = " + size[i] + ": " + aveQuickSort[i]);
            System.out.println("Average time of Merge Sort with N = " + size[i] + ": " + aveMergeSort[i]);
        }
    }
}
