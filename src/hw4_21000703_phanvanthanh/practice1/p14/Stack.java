package hw4_21000703_phanvanthanh.practice1.p14;

import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.util.Stack<Integer> binaryNumber = new java.util.Stack<>();
        int decimalNumber = sc.nextInt();
        while (decimalNumber != 0) {
            binaryNumber.push(decimalNumber % 2);
            decimalNumber /= 2;
        }
        while(!binaryNumber.isEmpty()) {
            System.out.print(binaryNumber.pop());
        }
    }
}
