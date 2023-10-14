package hw4_21000703_phanvanthanh.execrise4;

import java.util.Iterator;

public class LinkedListQueue<E> implements QueueInterface<E> {
    class Node {
        E data;
        Node next;
        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node front = null;
    private Node rear = null;
    private int size = 0;
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public E dequeue() {
        if(isEmpty()) throw new IllegalStateException("Queue is empty");
        E data = front.data;
        front = front.next;
        size--;
        if(isEmpty()) rear = null;
        return data;
    }
    public void enqueue(E element) {
        Node newNode = new Node(element);
        if(isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    public Iterator<E> iterator() {
        return new QueueIterator();
    }
    class QueueIterator implements Iterator<E> {
        private Node current = front;

        @Override
        public boolean hasNext() {
            return current != null;
        }
        public E next() {
            if(!hasNext()) throw new java.util.NoSuchElementException();
            E data = current.data;
            current = current.next;
            return data;
        }
    }
}

