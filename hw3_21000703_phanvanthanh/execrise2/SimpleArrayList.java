package hw3_21000703_phanvanthanh.execrise2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleArrayList<T> implements ListInterface<T>{
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;
    public SimpleArrayList () {
        array = (T[]) new Object [defaultSize];
    }
    public SimpleArrayList ( int capacity ) {
        array = (T[]) new Object [capacity];
    }
    public void add (T data ) {
        if(n == array.length) {
            T[] newArray = Arrays.copyOf(array, n+1);
            array = newArray;
        }
        array[n++] = data;
    }
    public T get (int i ) {
        if(i < 0 && i >= n) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[i];
    }
    public void set (int i , T data ) {
        if(i < 0 && i >= n) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        array[i] = data;
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
    public boolean isContain ( T data ) {
        boolean isContain = false;
        for(int i = 0; i < n; ++i) {
            if(array[i].equals(data)){
                isContain = true;
                break;
            }
        }
        return isContain;
    }
    public int size () {
        return n;
    }
    public boolean isEmpty () {
        return n == 0;
    }

    public Iterator <T > iterator () {
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
