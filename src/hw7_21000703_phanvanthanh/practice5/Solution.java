package hw7_21000703_phanvanthanh.practice5;

class Solution {
    class Node {
        int data;
        Node left, right;

        public Node(int d) {
            data = d;
            left = right = null;
        }
    }
    int count = 0;

    public void inorder(Node root, int k, Node curr){
        if(root == null || count >= k) return;

        inorder(root.left , k , curr);
        count++;
        if(count == k){
            curr.data = root.data;
        }
        inorder(root.right , k , curr);
    }
    // Return the Kth smallest element in the given BST
    public int KthSmallestElement(Node root, int K) {

        Node curr = new Node(-1);
        inorder(root , K , curr);
        return curr.data;
    }
}
