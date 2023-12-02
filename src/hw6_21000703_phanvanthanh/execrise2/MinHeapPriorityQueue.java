package hw6_21000703_phanvanthanh.execrise2;

import hw6_21000703_phanvanthanh.execrise1.SortedArrayPriorityQueue;

public class MinHeapPriorityQueue<K extends Comparable, E> extends SortedArrayPriorityQueue<K, E>{
    public void insertHeapPQ(K k, E e) {
        ArrEntry<K, E> entry = new ArrEntry<>();
        entry.key = k;
        entry.value = e;
        array[n++] = entry;
        upHeap();
    }
    public ArrEntry<K, E> removeMin() {
        ArrEntry<K, E> min = array[0];
        array[0] = array[--n];
        downHeap();
        return min;
    }
    protected void upHeap() {
        int i = n-1;
        while (i > 0 && array[(i-1)/2].getKey().compareTo(array[i].getKey()) > 0) {
            swap((i-1)/2, i);
            i = (i-1)/2;
        }
    }
    protected void downHeap() {
        int i = 0;
        while(2 * i + 1 < n) {
            int minChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            if(rightChild < n && array[rightChild].getKey().compareTo(array[minChild].getKey()) < 0) {
                minChild = rightChild;
            }
            if(array[minChild].getKey().compareTo(array[i].getKey()) < 0) {
                swap(i, minChild);
                i = minChild;
            } else {
                break;
            }
        }
    }
    private void swap(int i, int j) {
        ArrEntry<K, E> temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
