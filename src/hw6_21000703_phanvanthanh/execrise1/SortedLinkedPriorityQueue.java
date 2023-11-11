package hw6_21000703_phanvanthanh.execrise1;

public class SortedLinkedPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface<K, E>{
    protected class NodeEntry<K, E> implements Entry<K, E> {
        private K key;
        private E element;
        private NodeEntry<K, E> next;
        public NodeEntry(K k, E e) {
            key = k;
            element = e;
        }
        @Override
        public K getKey() {
            return key;
        }

        @Override
        public E getValue() {
            return element;
        }
    }
    private NodeEntry<K, E> head;
    private NodeEntry<K, E> tail;
    private int n = 0;
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
        if(entry == null) {
            throw new Exception("Entry can not be null");
        }
        NodeEntry<K, E> newNode = new NodeEntry<>(entry.getKey(), entry.getValue());
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else if(newNode.getKey().compareTo(head.getKey()) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            NodeEntry<K, E> current = head;
            while(current.next != null && newNode.getKey().compareTo(current.next.getKey()) > 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        if(newNode.next == null) {
            tail = newNode;
        }
        n++;
    }

    @Override
    public void insert(K k, E e) throws Exception {
        if(k == null || e == null) throw new Exception("key or element can not be null");
        NodeEntry<K, E> newNode = new NodeEntry<>(k, e);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else if (newNode.getKey().compareTo(head.getKey()) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            NodeEntry<K, E> current = head;
            while(current.next != null && newNode.getKey().compareTo(current.next.getKey()) > 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        if (newNode.next == null) {
            tail = newNode;
        }
        n++;
    }

    @Override
    public Entry<K, E> removeMin() throws Exception {
        if(empty()) throw new Exception("Priority queue is empty");
        NodeEntry<K, E> minNode = head;
        head = head.next;
        minNode.next = null;
        n--;
        return minNode;
    }

    @Override
    public Entry<K, E> min() throws Exception {
        if(empty()) throw new Exception("Priority queue is empty");
        return head;
    }
}
