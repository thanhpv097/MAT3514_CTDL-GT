package hw3_21000703_phanvanthanh.execrise9;
class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
}
class Solution {
    public int count(Node head, int search_for)
    {
        if(head == null){
            return 0;
        }
        int count=0;
        while(head != null){
            if(head.data ==search_for ){
                count++;
            }
            head=head.next;
        }
        return count;
    }
}