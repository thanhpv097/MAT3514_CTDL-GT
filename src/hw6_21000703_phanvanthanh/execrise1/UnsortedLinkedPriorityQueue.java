package hw6_21000703_phanvanthanh.execrise1;
public class UnsortedLinkedPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface<K, E>{
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
    int n = 0;
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
        if(entry == null) throw new Exception("Entry can not be null");
        NodeEntry<K, E> newNode = new NodeEntry<>(entry.getKey(), entry.getValue());
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        n++;
    }

    @Override
    public void insert(K k, E e) throws Exception {
        if(k == null || e == null) throw new Exception("Key and element can not be null");
        NodeEntry<K, E> newNode = new NodeEntry<>(k, e);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        n++;
    }

    @Override
    public Entry<K, E> removeMin() throws Exception {
        if(empty()) throw new Exception("Priority queue is empty");
        NodeEntry<K, E> minNode = findMinNode();
        removeNode(minNode);
        return minNode;
    }

    @Override
    public Entry<K, E> min() throws Exception {
        if(empty()) throw new Exception("Priority queue is empty");
        NodeEntry<K, E> minNode = findMinNode();
        return minNode;
    }
    private NodeEntry<K, E> findMinNode() {
        NodeEntry<K, E> current = head;
        NodeEntry<K, E> minNode = head;
        while(current != null) {
            if(current.getKey().compareTo(minNode.getKey()) < 0) {
                minNode = current;
            }
            current = current.next;
        }
        return minNode;
    }
    private void removeNode(NodeEntry<K, E> nodeToRemove) {
        NodeEntry<K, E> current = head;
        NodeEntry<K, E> previous = null;
        while(current != null && current != nodeToRemove) {
            previous = current;
            current = current.next;
        }
        if(current == null) {
            return;
        }
        if(previous == null) {
            head = current.next;
        } else {
            previous.next = current.next;
        }
        if(nodeToRemove == tail) {
            tail = previous;
        }
        nodeToRemove.next = null;
        n--;
    }
}
