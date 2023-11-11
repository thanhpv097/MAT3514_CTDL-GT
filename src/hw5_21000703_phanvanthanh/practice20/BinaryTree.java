package hw5_21000703_phanvanthanh.practice20;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    public BinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BinaryTree {
    Node head;
    BinaryTreeNode root;
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public BinaryTreeNode convertList2Binary(BinaryTreeNode node) {
        Queue<BinaryTreeNode> q = new LinkedList<>();
        if(head == null) {
            return null;
        }
        node = new BinaryTreeNode(head.data);
        q.add(node);
        head = head.next;
        while(head != null) {
            BinaryTreeNode parent = q.peek();
            BinaryTreeNode leftChild;
            BinaryTreeNode rightChild = null;
            leftChild = new BinaryTreeNode(head.data);
            q.add(leftChild);
            head = head.next;
            if(head != null) {
                rightChild = new BinaryTreeNode(head.data);
                q.add(rightChild);
                head = head.next;
            }
            parent.left = leftChild;
            parent.right = rightChild;
            q.poll();
        }
        return node;
    }
    public void inorderTraversal(BinaryTreeNode node) {
        if(node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.push(36);
        tree.push(30);
        tree.push(25);
        tree.push(15);
        tree.push(12);
        tree.push(10);
        BinaryTreeNode node = tree.convertList2Binary(tree.root);

        System.out.println("Inorder Traversal of the constructed Binary Tree is:");
        tree.inorderTraversal(node);
    }
}
