package hw6_21000703_phanvanthanh.execrise1;

public interface PriorityQueueInterface <K, E> {
    public int size();
    public boolean empty();
    public void insert(Entry<K, E> entry) throws Exception;
    public void insert(K k, E e) throws Exception;
    public Entry<K, E> removeMin() throws Exception;
    public Entry<K, E> min() throws Exception;
}
