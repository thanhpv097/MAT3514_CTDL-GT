package hw5_21000703_phanvanthanh.execrise1;

public interface BinaryTreeInterface<T> {
    T root();
    int size();
    boolean isEmpty();
    int numChildren(T p);
    T parent(T p) throws Exception;
    T left(T p);
    T right(T p);
    T sibling(T p);
}
