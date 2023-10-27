package hw5_21000703_phanvanthanh.execrise2;

import hw5_21000703_phanvanthanh.execrise1.LinkedBinaryTree;

public class ExpressionTree<E> extends LinkedBinaryTree {
    public void preorderPrint(Node<E> p) {
        if(p == null) return;
        System.out.print(p.element);
        preorderPrint(p.left);
        preorderPrint(p.right);
    }
    public void postorderPrint(Node<E> p) {
        if(p == null) return;
        postorderPrint(p.left);
        postorderPrint(p.right);
        System.out.print(p.element);
    }
    public void inorderPrint(Node<E> p) {
        if (p == null) return;
        boolean isOperator = isOperator(p.element);

        if (isOperator) {
            System.out.print("(");
        }

        inorderPrint(p.left);
        System.out.print(p.element);
        inorderPrint(p.right);

        if (isOperator) {
            System.out.print(")");
        }
    }

    private boolean isOperator(E element) {
        return "+-*/".contains(element.toString());
    }
}
