package hw5_21000703_phanvanthanh.practice1;

import java.util.Scanner;

class BinaryTree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    BinaryTree() {
        this.root = null;
    }

    Node insert(int data) {
        root = insert(data, root);
        return root;
    }

    Node insert(int data, Node node) {
        if (node == null) {
            node = new Node(data);
            return node;
        } else if (data >= node.data) { // Changed to >= for duplicates
            node.right = insert(data, node.right);
        } else {
            node.left = insert(data, node.left);
        }
        return node;
    }

    Node getRoot() {
        return this.root;
    }

    void inorderTraverse(Node root) {
        if (root != null) {
            inorderTraverse(root.left);
            System.out.print(root.data + " ");
            inorderTraverse(root.right);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        BinaryTree test = new BinaryTree();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            test.insert(temp);
        }
        test.inorderTraverse(test.getRoot());
    }
}