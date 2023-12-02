package hw7_21000703_phanvanthanh.practice3;

import java.util.ArrayList;
class Tree {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static ArrayList<Integer> nodes=new ArrayList<>();
    public static float findMedian(Node root) {
        nodes.clear();
        inOrderTraversal(root);
        int n=nodes.size();
        if(n%2==0) {
            int mid1=nodes.get(n/2-1);
            int mid2=nodes.get(n/2);
            return (float) (mid1+mid2)/2;
        } else {
            return nodes.get((n-1)/2);
        }
    }
    public static void inOrderTraversal(Node root) {
        if(root!=null) {
            inOrderTraversal(root.left);
            nodes.add(root.data);
            inOrderTraversal(root.right);
        }
    }
}