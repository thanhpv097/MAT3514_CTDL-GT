package hw7_21000703_phanvanthanh.execrise1.array;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class UnsortedArray<T extends Comparable<T>> implements ArrayInterface<T> {
    private int n;
    private T[] array;
    private int defaultSize = 1000;
    public UnsortedArray () {
        array = (T[]) new Object [defaultSize];
    }
    public UnsortedArray ( int capacity ) {
        array = (T[]) new Object [capacity];
    }
    public void add (T data ) throws Exception {
        if(n == defaultSize) throw new Exception("Array is full");
        array[n] = data;
        n++;
    }
    public T get (int i ) {
        if(i < 0 && i >= n) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[i];
    }
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
    public int searchData(T data) {
        if(isEmpty()) {
            throw new IllegalStateException("Array is empty");
        }
        int index = -1;
        for(int i = 0; i < array.length; i++) {
            if(array[i].compareTo(data) == 0) {
                index = i;
                break;
            }
        }
        return index;
    }
    public int size () {
        return n;
    }
    public boolean isEmpty () {
        return n == 0;
    }
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
