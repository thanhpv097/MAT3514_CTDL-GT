package hw4_21000703_phanvanthanh.execrise1;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String hoTen = "PhanVanThanh";
        for(int i = 0; i < hoTen.length(); ++i) {
            if(i % 2 == 0) {
                stack.push(hoTen.charAt(i));
            }
            if(i % 3 == 0) {
                stack.pop();
            }
        }
        System.out.println(stack);
    }
}
