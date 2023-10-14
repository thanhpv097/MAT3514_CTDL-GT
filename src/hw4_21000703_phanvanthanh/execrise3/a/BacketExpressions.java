package hw4_21000703_phanvanthanh.execrise3.a;

import hw4_21000703_phanvanthanh.execrise2.ArrayStack;
import hw4_21000703_phanvanthanh.execrise2.StackInterface;

public class BacketExpressions {
    private String e;
    public BacketExpressions(String expression) {
        this.e = expression;
    }
    public boolean isvalid() {
        StackInterface<Character> listBacket = new ArrayStack<>();
        for(char c: e.toCharArray()) {
            if(c == '(' || c == '[' || c== '{') {
                listBacket.push(c);
            } else if(c == ')' || c == ']' || c == '}') {
                if(listBacket.isEmpty()) return false;
                char parentheses = listBacket.pop();
                if(c == ')' && parentheses != '('
                || c == ']' && parentheses != '['
                || c == '}' && parentheses != '{') {
                    return  false;
                }
            }
        }
        return listBacket.isEmpty();
    }
}
