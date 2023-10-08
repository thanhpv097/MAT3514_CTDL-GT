package hw4_21000703_phanvanthanh.execrise2;

import java.util.Iterator;

public class LinkedListStack<E> implements StackInterface<E>{
    class Node {
        E element;
        Node next;
        public Node(E data) {
            this.element = data;
            this.next = null;
        }
    }
    private Node stack = null;
    private int size = 0;
    public int size() {
        return size;
    }
    public void push(E element) {
        Node newNode = new Node(element);
        newNode.next = stack;
        stack = newNode;
        ++size;
    }
    public E pop() {
        if(isEmpty()) throw new IllegalStateException("Stack is empty");
        E data = stack.element;
        stack = stack.next;
        size--;
        return data;
    }
    @Override
    public E top() {
        if(isEmpty()) throw new IllegalStateException("Stack is empty");
        return stack.element;
    }
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
    public Iterator<E> iterator() {
        return new StackIterator();
    }
    class StackIterator implements Iterator<E> {
        private Node currentNode = stack;
        public boolean hasNext() {
            return currentNode != null;
        }
        public E next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            E data = currentNode.element;
            currentNode = currentNode.next;
            return data;
        }
    }
}
