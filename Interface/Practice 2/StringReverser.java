public interface StringReverser {

    public void reverse();

    public void reverseUsingStringBuilder();

}

class Reverser implements StringReverser {

    String s = "Good Morning";

    public void reverseUsingStringBuilder() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(s);
        sb1.reverse();
        String str = sb1.toString();
        System.out.println("str = " + str);

    }

    public void reverse() {

        String str = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            char c = s.charAt(i);
            str = str + c;

        }
        System.out.println("str = " + str);

    }

}

class TestString {

    public static void main(String[] args) {

        Reverser r = new Reverser();
        r.reverseUsingStringBuilder();
        r.reverse();

    }

}