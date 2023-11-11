package hw5_21000703_phanvanthanh.practice1;

import java.util.Scanner;

class Recursion {
    public long recursion(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * recursion(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = sc.nextInt();
        Recursion recursion = new Recursion();
        System.out.println("The power of N is: " + recursion.recursion(N));
    }
}
