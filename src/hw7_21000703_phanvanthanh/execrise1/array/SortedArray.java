package hw7_21000703_phanvanthanh.execrise1.array;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SortedArray<T extends Comparable<T>> implements ArrayInterface<T> {
    private int n = 0;
    private T[] array;
    private int defaultSize = 1000;
    public SortedArray () {
        array = (T[]) new Object [defaultSize];
    }
    public SortedArray ( int capacity ) {
        array = (T[]) new Object [capacity];
    }
    @Override
    public void add(T data) throws Exception {
        if(n == defaultSize) throw new Exception("Array is full!");
        int i = n - 1;
        while(i >= 0 && data.compareTo(array[i]) > 0) {
            array[i + 1] = array[i];
            i--;
        }
        array[i+1] = data;
        n++;
    }

    @Override
    public T get (int i ) {
        if(i < 0 && i >= n) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[i];
    }
    @Override
    public void remove ( T data ) {
        int indexToRemove = -1;
        for(int i = 0; i < n; ++i) {
            if(array[i].equals(data)) {
                indexToRemove = i;
                break;
            }
        }
        for(int i = indexToRemove; i < n - 1; ++i) {
            array[i] = array[i+1];
        }
        array[n-1] = null;
        n--;
    }

    public int searchData(T data, int low, int high) {
        if(low > high) {
            return low;
        }
        int mid = (low + high) / 2;
        if(data.compareTo(array[mid]) == 0) {
            return mid;
        } else if(data.compareTo(array[mid]) > 0) {
            return searchData(data, mid + 1, high);
        } else {
            return searchData(data, low, mid - 1);
        }
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public Iterator<T > iterator () {
        return new Iterator<T>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < n;
            }
            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return array[currentIndex++];
            }
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Remove operation is not supported");
            }
        };
    }
}
