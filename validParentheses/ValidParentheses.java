package validParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

//problem number 20
public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<String> stack = new ArrayDeque<>();

        for(int i=0; i < s.length(); i++){
            String character = String.valueOf(s.charAt(i));
            if(character.equals("(")){
                stack.addFirst(")");
            }else if(character.equals("{")){
                stack.addFirst("}");
            }else if(character.equals("[")){
                stack.addFirst("]");
            }else if(character.equals(")") || character.equals("}") || character.equals("]")){
                if (stack.isEmpty() || !character.equals(stack.getFirst())) {
                    return false;
                } else {
                    stack.removeFirst();
                }
            }
        }

        return stack.isEmpty();
    }
}
