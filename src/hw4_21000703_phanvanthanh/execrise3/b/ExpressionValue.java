package hw4_21000703_phanvanthanh.execrise3.b;

import hw4_21000703_phanvanthanh.execrise2.ArrayStack;
import hw4_21000703_phanvanthanh.execrise2.StackInterface;

public class ExpressionValue{
    StringBuilder postfix = new StringBuilder();
    public String infixToPostfix(String infix) {
        StackInterface<Character> operatorStack = new ArrayStack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isDigit(c)) {
                postfix.append(c);
            } else if (isOperator(c)) {
                while (!operatorStack.isEmpty() && precedence(c) <= precedence(operatorStack.top())) {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.push(c);
            } else if (c == '(') {
                operatorStack.push(c);
            } else if (c == ')') {
                while (!operatorStack.isEmpty() && operatorStack.top() != '(') {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.pop();
            }
        }

        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop());
        }

        return postfix.toString();
    }
    public int evaluatePostfix(String expression) {
        StackInterface<Integer> operandStack = new ArrayStack<>();
        String str = infixToPostfix(expression);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                operandStack.push(Character.getNumericValue(c));
            } else if (isOperator(c)) {
                int operand2 = operandStack.pop();
                int operand1 = operandStack.pop();
                int result = performOperation(c, operand1, operand2);
                operandStack.push(result);
            }
        }

        return operandStack.pop();
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private int performOperation(char operator, int a, int b) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    private int precedence(char operator) {
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
}
