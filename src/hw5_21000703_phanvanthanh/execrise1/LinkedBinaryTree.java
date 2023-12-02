package hw5_21000703_phanvanthanh.execrise1;

public class LinkedBinaryTree<E,T> implements BinaryTreeInterface<T>{
    class Node <E> {
        public E element;
        private Node<E> parent;
        public Node<E> left;
        public Node<E> right;
        public Node (E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
            element = e;
            parent = above;
            left = leftChild;
            right = rightChild;
        }
    }
    private Node<E> root;
    private int size = 0;
    public Node<E> addRoot(E element) {
        if(!isEmpty()) {
            throw new IllegalStateException("The tree is not empty.");
        } else {
            root = new Node<>(element, null, null, null);
            size = 1;
            return root;
        }
    }
    public Node<E> addLeft(Node<E> parent, E element) {
        if(parent.left != null) {
            throw new IllegalStateException("Left child already exists.");
        } else {
            Node<E> child = new Node(element, parent, null, null);
            parent.left = child;
            size++;
            return child;
        }
    }
    public Node<E> addRight(Node<E> parent, E element) {
        if(parent.right != null) {
            throw new IllegalStateException("Right child already exists.");
        } else {
            Node<E> child = new Node(element, parent, null, null);
            parent.right = child;
            size++;
            return child;
        }
    }
    public void set(Node p, E element) {
        p.element = element;
    }
    @Override
    public T root() {
        return (T) root;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int numChildren(T p) {
        Node<E> node = (Node<E>) p;
        int count = 0;
        if(node.left != null) {
            count++;
        }
        if(node.right != null){
            count++;
        }
        return count;
    }
    @Override
    public T parent(T p) throws Exception {
        Node<E> node = (Node<E>) p;
        if(node.parent == null) {
            throw new Exception("No parent for the root node.");
        } else {
            return (T) node.parent;
        }
    }

    @Override
    public T left(T p) {
        Node<E> node = (Node<E>) p;
        if(node.left == null) {
            return null;
        } else {
            return (T) node.left;
        }
    }

    @Override
    public T right(T p) {
        Node<E> node = (Node<E>) p;
        if(node.right == null) {
            return null;
        } else {
            return (T) node.right;
        }
    }

    @Override
    public T sibling(T p) {
        Node<E> node = (Node<E>) p;
        Node<E> parent = node.parent;
        if(parent == null) {
            return null;
        }
        if(parent.left == node) {
            if(parent.right != null) {
                return (T) parent.right;
            }
        }
        if(parent.right == node) {
            if(parent.left != null) {
                return (T) parent.left;
            }
        }
        return null;
    }
}
