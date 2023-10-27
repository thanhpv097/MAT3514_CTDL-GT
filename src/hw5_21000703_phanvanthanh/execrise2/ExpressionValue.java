package hw5_21000703_phanvanthanh.execrise2;

import hw5_21000703_phanvanthanh.execrise1.LinkedBinaryTree;

import java.util.Stack;

public class ExpressionValue<E> extends LinkedBinaryTree {
    public double isValue() {
        String str = postfixExpression(makeExpressionTree());
        Stack<Double> stack = new Stack<>();
        for(char e : str.toCharArray()) {
            if (isNumeric(e)) {
                stack.push((double)(e - '0'));
            }
            else if (isOperator(e)) {
                double v2 = stack.pop();
                double v1 = stack.pop();
                double result = performOperation(v1, v2, e);
                stack.push(result);
            }
        }
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Biểu thức không hợp lệ.");
        }

        return stack.pop();
    }
    public boolean isNumeric(char c) {
        return Character.isDigit(c);
    }
    public boolean isOperator(char c) {
        return "+-*/".contains(String.valueOf(c));
    }
    public double performOperation(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by 0 is invalid.");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Caculation is invalid: " + operator);
        }
    }
    public void postorderPrint(Node<E> p, StringBuilder result) {
        if (p == null) return;
        postorderPrint(p.left, result);
        postorderPrint(p.right, result);
        result.append(p.element);
    }
    public String postfixExpression(LinkedBinaryTree p) {
        StringBuilder result = new StringBuilder();
        postorderPrint((Node) p.root(), result);
        return result.toString();
    }
    public LinkedBinaryTree makeExpressionTree() {
        LinkedBinaryTree tree = new LinkedBinaryTree();
        tree.addRoot('*');
        tree.addLeft((Node) tree.root(), '+');
        tree.addRight((Node) tree.root(), '-');
        tree.addLeft((Node) tree.left(tree.root()), '3');
        tree.addRight((Node) tree.left(tree.root()), '4');
        tree.addLeft((Node) tree.right(tree.root()), '5');
        tree.addRight((Node) tree.right(tree.root()), '1');
        return tree;
    }
    public static void main(String[] args) {
        ExpressionValue<Character> expression = new ExpressionValue<>();
        double result = expression.isValue();
        System.out.println("calculation results: " + result);
    }
}
