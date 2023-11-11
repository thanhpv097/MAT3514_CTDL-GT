package hw5_21000703_phanvanthanh.execrise3;
import java.util.Stack;
class BinaryTreeNode {
    char data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(char data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class TreeExpression {
    public String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();
        for(char token : infix.toCharArray()) {
            if (token == '(') {
                operatorStack.push(token);
            } else if (token == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.pop();
            } else if (Character.isDigit(token)) {
                postfix.append(token);
            } else if (isOperator(token)) {
                while (!operatorStack.isEmpty() && precedence(token) <= precedence(operatorStack.peek())) {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.push(token);
            }
        }
        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop());
        }

        return postfix.toString();
    }
    public boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    public boolean isOperand(char token) {
        try {
            Double.parseDouble(Character.toString(token));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }
    public BinaryTreeNode buildExpressionTree(String postfixExpression) {
        Stack<BinaryTreeNode> treeNodeStack = new Stack<>();
        for(char token : postfixExpression.toCharArray()){
            if(isOperand(token)) {
                treeNodeStack.push(new BinaryTreeNode(token));
            } else if (isOperator(token)) {
                BinaryTreeNode rightOperand = treeNodeStack.pop();
                BinaryTreeNode leftOperand = treeNodeStack.pop();
                BinaryTreeNode operatorNode = new BinaryTreeNode(token);

                operatorNode.left = leftOperand;
                operatorNode.right = rightOperand;

                treeNodeStack.push(operatorNode);
            }
        }
        return treeNodeStack.pop();
    }
    public void printExpressionTree(BinaryTreeNode treeNode, String prefix, boolean isLeft) {
        if (treeNode != null) {
            System.out.println(prefix + (isLeft ? "L--- " : "R--- ") + treeNode.data);
            printExpressionTree(treeNode.left, prefix + (isLeft ? "    " : "|   "), true);
            printExpressionTree(treeNode.right, prefix + (isLeft ? "    " : "|   "), false);
        }
    }
    public void printExpressionTree(BinaryTreeNode root) {
        printExpressionTree(root, "", true);
    }
}
