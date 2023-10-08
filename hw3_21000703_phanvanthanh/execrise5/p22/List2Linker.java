package hw3_21000703_phanvanthanh.execrise5.p22;

import java.util.Scanner;

class Node {
    protected int data;
    protected Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    private Node head;
    private int size;
    public LinkedList() {
        this.head = null;
        size = 0;
    }
    private void addHead(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public void addTail(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }
    public void addElement(int data, int indexInsert) {
        Node newNode = new Node(data);
        Node temp = head;
        if(indexInsert == 0) {
            addHead(data);
        } else if(indexInsert == size - 1) {
            addTail(data);
        } else {
            for(int i = 0; i < indexInsert - 1; ++i) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
public class List2Linker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList list = new LinkedList();
        for(int i = 0; i < n; ++i) {
            int data = sc.nextInt();
            list.addTail(data);
        }
        int k = sc.nextInt();
        int data = sc.nextInt();
        list.addElement(data, k);
        list.printList();
    }
}
