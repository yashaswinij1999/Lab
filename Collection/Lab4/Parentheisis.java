import java.util.Stack;

public class Parentheisis {

    public static void main(String[] args) {

        String s = "{[]}";
        System.out.println(IsParenthesis(s));
    }

    public static boolean IsParenthesis(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (isOpening(c)) {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    if (!isMatching(st.peek(), c)) {
                        return false;
                    } else {
                        st.pop();
                    }
                }
            }
        }
        return st.empty();

    }

    public static boolean isOpening(Character c) {

        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isMatching(Character a, Character b) {

        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');

    }

}
