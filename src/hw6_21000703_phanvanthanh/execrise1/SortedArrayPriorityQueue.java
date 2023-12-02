package hw6_21000703_phanvanthanh.execrise1;

public class SortedArrayPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface<K, E>{

    public class ArrEntry<K, E> implements Entry<K, E> {
        public K key;
        public E value;
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
    public ArrEntry<K, E>[] array;

    public SortedArrayPriorityQueue() {
        array = new ArrEntry[defaultsize];
    }
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
        if (n == defaultsize) throw new Exception("Array is full");
        ArrEntry<K, E> entry = new ArrEntry<>();
        entry.key = k;
        entry.value = e;

        int i = n - 1;
        while (i >= 0 && k.compareTo(array[i].getKey()) > 0) {
            array[i + 1] = array[i];
            i--;
        }
        array[i + 1] = entry;
        n++;
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
