package hw7_21000703_phanvanthanh.practice7;

class Tree {
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    int minValue(Node node) {
        if(node == null){
            return -1;
        }
        if(node.next == null){
            return node.data;
        }
        return minValue(node.next);
    }
}