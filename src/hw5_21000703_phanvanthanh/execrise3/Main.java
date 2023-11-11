package hw5_21000703_phanvanthanh.execrise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String expression = sc.next();
        TreeExpression treeExpression = new TreeExpression();
        String infixToPostfix = treeExpression.infixToPostfix(expression);
        BinaryTreeNode root = treeExpression.buildExpressionTree(infixToPostfix);
        treeExpression.printExpressionTree(root);
    }
}
