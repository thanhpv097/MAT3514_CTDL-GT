package hw7_21000703_phanvanthanh.execrise1.array;

public interface ArrayInterface<T> extends Iterable<T>{
    void add(T data) throws Exception;
    T get(int i);
    void remove(T data);
    int size();
    boolean isEmpty();
}
