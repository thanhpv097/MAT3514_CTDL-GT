package hw3_21000703_phanvanthanh.execrise5.p23;

import java.util.Scanner;

class Node {
    protected int data;
    protected Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    private int size;
    private Node head;
    public LinkedList() {
        this.head = null;
        size = 0;
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
    public void deleteHead() {
        if(head == null) return;
        Node temp = head.next;
        head = temp;
        size--;
    }
    public void deleteTail() {
        if(head == null) return;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }
    public void deleteAt(int indexRemove) {
        if(indexRemove == 0) {
            deleteHead();
        } else if(indexRemove == size - 1){
            deleteTail();
        } else {
            Node temp = head;
            for(int i = 0; i < indexRemove - 1; ++i) {
                temp = temp.next;
            }
            Node temp2 = temp.next;
            temp.next = temp2.next;
            size--;
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
public class List3Linker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = sc.nextInt();
        for(int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            list.addTail(x);
        }
        int k = sc.nextInt();
        list.deleteAt(k);
        list.printList();
    }
}
