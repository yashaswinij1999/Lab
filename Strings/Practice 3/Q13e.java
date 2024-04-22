
public class Q13e {

    public static void main(String[] args) {

        reverseStr("I Love Java");

    }
    public static void reverseStr(String str) {

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(sb.toString());
        
    }

}
