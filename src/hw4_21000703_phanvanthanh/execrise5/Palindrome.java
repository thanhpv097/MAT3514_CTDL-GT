package hw4_21000703_phanvanthanh.execrise5;

import hw4_21000703_phanvanthanh.execrise2.ArrayStack;
import hw4_21000703_phanvanthanh.execrise2.StackInterface;
import hw4_21000703_phanvanthanh.execrise4.ArrayQueue;
import hw4_21000703_phanvanthanh.execrise4.QueueInterface;

public class Palindrome {
    public Palindrome(){
    }
    public boolean isPalindrome(String palindromeLine) {
        StackInterface listStack = new ArrayStack();
        QueueInterface listQueue = new ArrayQueue();
        boolean isPalindrome = true;
        for(char e : palindromeLine.toCharArray()) {
            listStack.push(e);
            listQueue.enqueue(e);
        }
        for(int i = 0; i < palindromeLine.length(); ++i) {
            if(listQueue.dequeue() != listStack.pop()) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
