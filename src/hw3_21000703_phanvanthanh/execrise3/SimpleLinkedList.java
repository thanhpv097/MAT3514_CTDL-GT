package hw3_21000703_phanvanthanh.execrise3;

import java.util.Iterator;

public class SimpleLinkedList<T> implements Iterable<T>{
    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top = null;
    private Node bot = null;
    private int size = 0;
    public void add(T data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            top = newNode;
            bot = newNode;
        } else {
            bot.next = newNode;
            bot = newNode;
        }
        ++size;
    }
    public void addBot ( T data ) {
        add(data);
    }
    public T get ( int i ) {
        if(i < 0 && i >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node currentNode = top;
        for(int index = 0; index < i; ++index) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
    public void set ( int i , T data ) {
        if(i < 0 && i >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node currentNode = top;
        for(int index = 0; index < i; ++index) {
            currentNode = currentNode.next;
        }
        currentNode.data = data;
    }
    public boolean isContain ( T data ) {
        Node currentNode = top;
        while(currentNode != null) {
            if(currentNode.data.equals(data)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
    public int size () {
        return size;
    }
    public boolean isEmpty () {
        return size == 0;
    }
    public T removeTop () {
        if(isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        T removedData = top.data;
        top = top.next;
        --size;
        if(isEmpty()) {
            bot = null;
        }
        return removedData;
    }
    public T removeBot () {
        if(isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        T removeData = bot.data;
        if(size == 1) {
            top = null;
            bot = null;
        } else {
            Node currentNode = top;
            while(currentNode.next != bot) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            bot = currentNode;
        }
        --size;
        return removeData;
    }
    public void remove(T data) {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        if (top.data.equals(data)) {
            removeTop();
            return;
        }
        Node currentNode = top;
        while (currentNode.next != null) {
            if (currentNode.next.data.equals(data)) {
                currentNode.next = currentNode.next.next;
                --size;
                if (currentNode.next == null) {
                    bot = currentNode;
                }
                return;
            }
            currentNode = currentNode.next;
        }
    }
    public int indexOf(T data) {
        Node currentNode = top;
        int index = 0;

        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node currentNode = top;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            T data = currentNode.data;
            currentNode = currentNode.next;
            return data;
        }
    }
}
