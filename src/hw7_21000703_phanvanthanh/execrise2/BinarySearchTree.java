package hw7_21000703_phanvanthanh.execrise2;

public class BinarySearchTree {
    class Node {
        int data;
        Node parent;
        Node left;
        Node right;
        public Node (int data, Node above, Node leftChild, Node rightChild) {
            this.data = data;
            parent = above;
            left = leftChild;
            right = rightChild;
        }
    }
    private Node root;
    private int n = 0;

    public int findMin() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }

        Node current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    public boolean search(int data) {
        return search(root, data);
    }

    private boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }

        if (data == root.data) {
            return true;
        } else if (data < root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

    public void insert(int data) {
        root = insert(root, null, data);
    }

    private Node insert(Node root, Node parent, int data) {
        if (root == null) {
            n++;
            return new Node(data, parent, null, null);
        }

        if (data < root.data) {
            root.left = insert(root.left, root, data);
        } else if (data > root.data) {
            root.right = insert(root.right, root, data);
        }

        return root;
    }

    public void delete(int data) {
        root = delete(root, data);
    }

    private Node delete(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    private int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }
}
