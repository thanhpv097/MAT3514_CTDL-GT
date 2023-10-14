package hw4_21000703_phanvanthanh.execrise4;

public interface QueueInterface <E > extends Iterable <E > {
    public int size();
    public void enqueue(E element);
    public E dequeue();
    public boolean isEmpty();
}
