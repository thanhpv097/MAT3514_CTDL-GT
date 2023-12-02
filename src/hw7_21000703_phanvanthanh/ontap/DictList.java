package hw7_21000703_phanvanthanh.ontap;

public class DictList<T> implements ListInterface<T> {
    private int n = 0;
    public T[] array = (T[]) new Object[100];
    @Override
    public void add(T data) {
        array[n]  = data;
        n++;
    }

    @Override
    public T get(int i) {
        return array[i];
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }
}
