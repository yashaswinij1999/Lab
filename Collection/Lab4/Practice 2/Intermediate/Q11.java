import java.util.Stack;

public class Q11 {

    public static void main(String[] args) {

        String str = "{([)}";
        System.out.println(isParenthesis(str));

    }

    public static boolean isParenthesis(String str) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (isOpening(c)) {
                st.push(c);

            } else {

                if (st.isEmpty()) {
                    return false;
                } else {

                    if (!isMatching(st.peek(), c)) {
                        return false;

                    } 
                    else {
                        st.pop();
                    }
                }
            }
        }
        return st.isEmpty();
    }

    public static boolean isOpening(Character c) {

        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isMatching(Character a, Character b) {

        return (a == '(' && b == ')') || (a == '{' && b == '}') || a == '[' && b == ']';
    }
}
