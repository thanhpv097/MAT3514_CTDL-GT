package hw4_21000703_phanvanthanh.practice1.p13;

import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for(char e : str.toCharArray()) {
            stack.push(e);
        }
        for (int i = 0; i < str.length(); ++i) {
            System.out.print(stack.pop());
        }
    }
}
