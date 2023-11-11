package hw6_21000703_phanvanthanh.execrise1;

public class SortedArrayPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface<K, E>{
    protected class ArrEntry<K, E> implements Entry<K, E> {
        K key;
        E value;
        @Override
        public K getKey() {
            return key;
        }

        @Override
        public E getValue() {
            return value;
        }
    }
    public int n = 0;
    public final int defaultsize = 1000;
    public ArrEntry<K, E>[] array = new ArrEntry[defaultsize];
    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean empty() {
        return n == 0;
    }

    @Override
    public void insert(Entry<K, E> entry) throws Exception {
        if(n == defaultsize) throw new Exception("Array is full!");
        K key = entry.getKey();
        int i = n - 1;
        while(i >= 0 && key.compareTo(array[i].getKey()) > 0) {
            array[i + 1] = array[i];
            i--;
        }
        array[i+1] = (ArrEntry<K, E>) entry;
        n++;
    }

    @Override
    public void insert(K k, E e) throws Exception {
        insert(new ArrEntry<K, E>() {{
            key = k;
            value = e;
            }});
    }

    @Override
    public Entry<K, E> removeMin() throws Exception {
        if(empty()) throw new Exception("Priority queue is empty");
        return array[--n];
    }

    @Override
    public Entry<K, E> min() throws Exception {
        if(empty()) throw new Exception("Priority queue is empty");
        return array[n-1];
    }
}
