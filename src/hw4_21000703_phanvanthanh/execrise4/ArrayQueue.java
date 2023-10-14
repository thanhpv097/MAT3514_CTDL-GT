package hw4_21000703_phanvanthanh.execrise4;

import java.util.Iterator;

public class ArrayQueue <E > implements QueueInterface<E > {
    private E[] queue;
    private int n = 0;
    private int top = 0;
    private int size = 0;
    private final int default_size = 1000;
    public ArrayQueue(int capacity) {
        n = capacity;
        queue = (E[]) new Object[capacity];
    }
    public  ArrayQueue() {
        queue = (E[]) new Object[default_size];
    }
    public int size() {
        return size;
    }
    public void enqueue(E element) {
        if(size() == queue.length) throw new IllegalStateException("Queue is full");
        int avail = (n + size) % queue.length;
        queue[avail] = element;
        size++;
    }
    public E dequeue() {
        if(isEmpty()) throw new IllegalStateException("Queue is empty");
        E answer = queue[n];
        queue[n] = null;
        n = (n+1) % queue.length;
        size--;
        return answer;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public Iterator<E> iterator() {
        return new ArrayQueueIterator();
    }
    class ArrayQueueIterator implements Iterator<E> {
            private int current = top;
        private int num = 0;
        public boolean hasNext() {
            return num < size;
        }
        public E next() {
            E data = queue[(current + num) % n];
            num++;
            return data;
        }
    }
}
