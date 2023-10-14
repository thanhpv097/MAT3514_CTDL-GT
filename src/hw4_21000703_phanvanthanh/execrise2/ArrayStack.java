package hw4_21000703_phanvanthanh.execrise2;

import java.util.Iterator;

public class ArrayStack<E> implements StackInterface<E> {
    private final int default_size = 1000;
    private E[] stack;
    private int size = -1;
    public ArrayStack(int capacity) {
        int n = capacity;
        stack = (E[]) new Object[n];
    }
    public ArrayStack() {
        stack = (E[]) new Object[default_size];
    }
    public int size() {
        return size + 1;
    }

    @Override
    public boolean isEmpty() {
        return size == -1;
    }
    public void push(E element) {
        if(size() == stack.length) throw new IllegalStateException("Queue is full");
        stack[++size] = element;
    }
    public E top() {
        if(isEmpty()) throw new IllegalStateException("Queue is empty");
        return stack[size];
    }
    public E pop() {
        if(isEmpty()) throw new IllegalStateException("Stack is empty");
        E answer = stack[size];
        stack[size] = null;
        size--;
        return answer;
    }
    public Iterator<E> iterator() {
        return new StackIterator();
    }
    class StackIterator implements Iterator<E> {
        private int num = -1;
        public boolean hasNext() {
            return num < size();
        }
        public E next() {
            if(!hasNext()) throw new java.util.NoSuchElementException();
            return stack[num++];
        }
    }
}
