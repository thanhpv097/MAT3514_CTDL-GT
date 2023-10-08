package hw3_21000703_phanvanthanh.execrise6;

class Node {
    int data;
    Node next;
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
class MyLinkedList {
    private Node head;
    private int size;
    public MyLinkedList() {
        this.head = new Node(0, null);
        size = 0;
    }
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node currentNode = head.next;
        for(int i = 0; i < index; ++i) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
    public void addAtHead(int data) {
        head.next = new Node(data, head.next);
        size++;
    }
    public void addAtTail(int data) {
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(data, null);
        size++;
    }
    public void addAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            return;
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(data, currentNode.next);
        size++;
    }
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        size--;
    }
}

