
public interface StringReverser {

    public String reverseString(String s);

    public String stringReverser(String s);

}

class Reverser implements StringReverser {

    @Override
    public String reverseString(String s) {
        String str = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            str = str + s.charAt(i);

        }
        return str;

    }

    @Override
    public String stringReverser(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }

}

class TestReverser {

    public static void main(String[] args) {

        Reverser r = new Reverser();
        System.out.println(r.reverseString("JavaScript"));
        System.out.println(r.stringReverser("JavaScript"));
    }

}
