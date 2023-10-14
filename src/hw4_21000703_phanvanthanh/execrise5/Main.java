package hw4_21000703_phanvanthanh.execrise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Palindrome palindrome = new Palindrome();
        if(palindrome.isPalindrome(str)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }
    }
}
