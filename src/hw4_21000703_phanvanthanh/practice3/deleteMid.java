package hw4_21000703_phanvanthanh.practice3;

import java.util.Stack;

public class deleteMid {
    public void deleteMid(Stack<Integer> stack, int sizeOfStack) {
        int[] array = new int[sizeOfStack / 2];
        for (int i = 0; i < sizeOfStack / 2; ++i) {
            array[i] = stack.pop();
        }
        stack.pop();
        for (int i = sizeOfStack / 2 - 1; i >= 0; --i) {
            stack.push(array[i]);
        }
    }
}
