package hw3_21000703_phanvanthanh.execrise8;
class Node {
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
class Solution {
    public int getNthFromLast(Node head, int n) {
        Node temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp=temp.next;
        }
        if(n > size){
            return -1;
        }else{
            Node curr = head;
            int i=1;
            while(i != size-n+1){
                i++;
                curr=curr.next;
            }
            return curr.data;
        }
    }
}
