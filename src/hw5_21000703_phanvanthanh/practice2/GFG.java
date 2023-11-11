package hw5_21000703_phanvanthanh.practice2;

public class GFG {
    private int height = -1;
    public class Node {
        int data;
        Node left;
        Node right;
    }
    public Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }
    public int findDepth(Node root, int data) {
        if(root == null) {
            return -1;
        } int dist = -1;
        if((root.data == data) || (dist = findDepth(root.left, data)) >= 0 || (dist = findDepth(root.right, data)) >= 0) {
            return dist + 1;
        }
        return dist;
    }
    public int findHeightUtil(Node root, int data) {
        if(root == null) {
            return -1;
        }
        int leftHeight = findHeightUtil(root.left, data);
        int rightHeight = findHeightUtil(root.right, data);

        int ans = Math.max(leftHeight, rightHeight) + 1;
        if(root.data == data) height = ans;
        return ans;
    }
    public int findHeight(Node root, int data) {
        findHeightUtil(root, data);
        return height;
    }

    public static void main(String[] args) {
        GFG tree = new GFG();
        Node root = tree.newNode(5);
        root.left = tree.newNode(10);
        root.right = tree.newNode(15);
        root.left.left = tree.newNode(20);
        root.left.right = tree.newNode(25);
        root.left.right.right = tree.newNode(45);
        root.right.left = tree.newNode(30);
        root.right.right = tree.newNode(35);
        int k = 25;

        System.out.println("Depth: " + tree.findDepth(root, k));

        System.out.println("Height: " + tree.findHeight(root, k));
    }
}
