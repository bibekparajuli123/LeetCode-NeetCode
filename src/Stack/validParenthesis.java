package Stack;

import java.util.Stack;

public class validParenthesis {
    public boolean isValid(String s){

        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                   if(  (ch == ')' && st.peek() == '(')||
                        (ch == '}' && st.peek() == '{') ||
                        (ch == ']' && st.peek() == '[')){
                       st.pop();
                } else {
                       return false;
                   }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        validParenthesis vp = new validParenthesis();

        System.out.println(vp.isValid("{[()]}"));
    }
}
