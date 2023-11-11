package hw6_21000703_phanvanthanh.execrise1;

public class UnsortedArrayPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface<K, E>{
    protected class ArrEntry<K, E> implements Entry<K, E> {
        K key;
        E value;
        public ArrEntry(K k, E e) {
            this.key = k;
            this.value = e;
        }

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
    public void insert (Entry entry) throws Exception {
        if(n == defaultsize) throw new Exception("Array is full");
        array[n++] = (ArrEntry<K, E>) entry;
    }

    @Override
    public void insert(K k, E e) throws Exception {
        Entry<K, E> newEntry = new ArrEntry<>(k, e);
        insert(newEntry);
    }

    @Override
    public Entry removeMin() throws Exception {
        if(n == 0) {
            throw new Exception("Array is empty");
        }
        int minIndex = 0;
        for(int i = 0; i < n; i++) {
            if(array[i].getKey().compareTo(array[minIndex].getKey()) < 0) {
                minIndex = i;
            }
        }
        Entry<K, E> minEntry = array[minIndex];
        for(int i = minIndex; i < n - 1; i++) {
            array[i] = array[i + 1  ];
        }
        n--;
        return minEntry;
    }

    @Override
    public Entry min() throws Exception {
        if(n == 0) {
            throw new Exception("Array is empty");
        }
        int minIdex = 0;
        for(int i = 0; i < n; i++) {
            if(array[i].getKey().compareTo(array[minIdex].getKey()) < 0) {
                minIdex = i;
            }
        }
        return array[minIdex];
    }
}
