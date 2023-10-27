package hw5_21000703_phanvanthanh.execrise2;

import hw5_21000703_phanvanthanh.execrise1.LinkedBinaryTree;

public class PrintExpression<E> extends ExpressionTree<E>{
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
        PrintExpression<Character> expression = new PrintExpression<>();
        LinkedBinaryTree tree = expression.makeExpressionTree();

        System.out.println("Representing the inoder: ");
        expression.inorderPrint((Node) tree.root());

        System.out.println("\nRepresenting the postorder: ");
        expression.postorderPrint((Node) tree.root());

        System.out.println("\nRepresenting the preorder: ");
        expression.preorderPrint((Node) tree.root());
    }
}
