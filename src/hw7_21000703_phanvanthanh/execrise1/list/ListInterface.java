package hw7_21000703_phanvanthanh.execrise1.list;

public interface ListInterface<T> extends Iterable<T>{
    void add(T data) throws Exception;
    void remove(T data);
    int size();
    boolean isEmpty();
    int searchData(T data);
}
