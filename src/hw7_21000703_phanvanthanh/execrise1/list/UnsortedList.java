package hw7_21000703_phanvanthanh.execrise1.list;

import java.util.Iterator;

public class UnsortedList<T extends Comparable<T>> implements ListInterface<T>{
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
    int n = 0;
    @Override
    public void add(T data) throws Exception {
        Node newNode = new Node(data);
        if(isEmpty()) {
            top = newNode;
            bot = newNode;
        } else {
            bot.next = newNode;
            bot = newNode;
        }
    }
    public T removeTop () {
        if(isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        T removedData = top.data;
        top = top.next;
        --n;
        if(isEmpty()) {
            bot = null;
        }
        return removedData;
    }
    @Override
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
                --n;
                if (currentNode.next == null) {
                    bot = currentNode;
                }
                return;
            }
            currentNode = currentNode.next;
        }
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int searchData(T data) {
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

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
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
