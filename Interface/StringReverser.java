public interface StringReverser {

    public String reverse(String str);

    public String reversing(String str);

}

class ReverseString implements StringReverser {

    public String reverse(String str) {

        String s = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }
        return s;

    }

    public String reversing(String str){

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        String s2 = sb.toString();
        return s2;
    }

}

class Test {
    public static void main(String[] args) {

        String s = "I have very good name";
        ReverseString rs = new ReverseString();
        System.out.println("using for loop = " +  rs.reverse(s));
        System.err.println("using StringBuilder  = " +  rs.reversing(s));

    }
}
