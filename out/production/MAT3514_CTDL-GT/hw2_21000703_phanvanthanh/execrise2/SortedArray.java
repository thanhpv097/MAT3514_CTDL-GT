package hw2_21000703_phanvanthanh.execrise2;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class SortedArray<T extends Number & Comparable<T>>{
    private Sort<T> sort;
    private T[] array;
    private T[] arrayCopy;
    private T[] arraySc;

    public SortedArray() {
    }

    public void setArray(Class<T> clazz, int size) {
        this.array = (T[]) Array.newInstance(clazz, size);
    }
    public void createArraySc(Class<T> clazz, int size) {
        Scanner sc = new Scanner(System.in);
        arraySc = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
        System.out.println("Enter the number in array: ");
        for (int i = 0; i < size; i++) {
            if (clazz.equals(Integer.class)) {
                arraySc[i] = (T) Integer.valueOf(sc.nextInt());
            } else if (clazz.equals(Double.class)) {
                arraySc[i] = (T) Double.valueOf(sc.nextDouble());
            } else if (clazz.equals(Float.class)) {
                arraySc[i] = (T) Float.valueOf(sc.nextFloat());
            } else {
                throw new IllegalArgumentException("Unsupported numeric type");
            }
        }
    }
    public T[] getArraySc() {
        return arraySc;
    }
    public void setArrayScCopy() {
        arrayCopy = getArraySc().clone();
    }
    public void createArray(Class<T> clazz) {
        if (!clazz.equals(Integer.class) && !clazz.equals(Double.class) && !clazz.equals(Float.class)) {
            throw new IllegalArgumentException("Unsupported numeric type");
        }
        array = (T[]) java.lang.reflect.Array.newInstance(clazz, array.length);
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            if (clazz.equals(Integer.class)) {
                array[i] = clazz.cast(random.nextInt());
            } else if (clazz.equals(Double.class)) {
                array[i] = clazz.cast(random.nextDouble());
            } else if (clazz.equals(Float.class)) {
                array[i] = clazz.cast(random.nextFloat());
            }
        }
    }

    public T[] getArray()    {
        return array;
    }
    public void setArrayCopy() {
        arrayCopy = array.clone();
    }
    public T[] getArrayCopy() {
        return arrayCopy;
    }
    public void setSort(Sort<T> sort) {
        this.sort = sort;
    }
    public void sort(T[] array) {
        sort.sort(array);
    }
    public long swapCount() {
        return sort.getSwapCount();
    }
    public long comparisonCount() {
        return sort.getComparisonCount();
    }
}
