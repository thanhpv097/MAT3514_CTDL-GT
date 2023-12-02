package hw7_21000703_phanvanthanh.practice2;

class Solution
{
    class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    Node pre=null;
    boolean isBST(Node root)
    {
        if(root!=null){
            if(!isBST(root.left)){
                return false;
            }
            if(pre!=null && root.data<=pre.data){
                return false;
            }
            pre = root;
            return isBST(root.right);
        }
        return true;

    }
}