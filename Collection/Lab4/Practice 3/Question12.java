import java.util.Stack;

public class Question12 {

    public static void main(String[] args) {

        String expression = "{[)]}";
        System.out.println(isParenthesis(expression));

    }

    public static boolean isParenthesis(String expression) {

        char[] c = expression.toCharArray();
        Stack<Character> st = new Stack<>();

        for (char ch : c) {

            if (ch == '(' || ch == '{' || ch == '[') {

                st.push(ch);

            } else {

                if (ch == ')' || ch == '}' || ch == ']') {

                    if (st.empty()) {
                        return false;
                    }

                    else {

                        char top = st.pop();
                        if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                            return false;
                        }

                    }

                }

            }

        }
        return st.empty();

    }

}
