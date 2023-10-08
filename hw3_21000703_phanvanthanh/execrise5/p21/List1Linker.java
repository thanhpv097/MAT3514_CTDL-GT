package hw3_21000703_phanvanthanh.execrise5.p21;

import java.util.Scanner;

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node createNode(int data) {
        Node node = new Node(data);
        node.next = null;
        node.data = data;
        return node;
    }

    public Node addElement(Node list, int data) {
        Node temp = createNode(data);
        list.next = temp;
        return temp;
    }

    public void printList(Node list) {
        Node node = list;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
public class List1Linker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int data = sc.nextInt();
        Node list = new Node(data);
        Node nodeList = list;
        for(int i = 1; i < n; ++i) {
            data = sc.nextInt();
            nodeList = nodeList.addElement(nodeList, data);
        }
        nodeList.printList(list);
    }
}

