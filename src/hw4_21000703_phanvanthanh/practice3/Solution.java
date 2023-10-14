package hw4_21000703_phanvanthanh.practice3;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int sizeOfStack = sc.nextInt();
        for(int i = 0; i < sizeOfStack; ++i) {
            stack.push(sc.nextInt());
        }
        deleteMid stackInt = new deleteMid();
        stackInt.deleteMid(stack, sizeOfStack);
        System.out.println(stack);
    }
}
