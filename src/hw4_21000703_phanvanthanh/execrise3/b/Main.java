package hw4_21000703_phanvanthanh.execrise3.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ExpressionValue expressionValue = new ExpressionValue();
        System.out.println(expressionValue.evaluatePostfix(str));
    }
}
