public class Q1 {

    public static void main(String[] args) {

        String s = new String("yashu");
        String s1 = "tommy";

        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);

        System.out.println("s.length() = " + s.length());
        System.out.println("s1.length() = " + s1.length());

        System.out.println(args[0]);

        String name = args[0];
        String name2 = args[1];

        // for (int i = 0; i < name.length(); i++) {

        // if (i % 2 == 0) {
        // System.out.println(name.charAt(i));
        // }

        // }

        // for (int i = 0; i < name.length(); i++) {

        // if (i % 2 == 0) {
        // System.out.print(name.charAt(i));
        // } else {
        // System.out.println(" ");
        // System.out.print(" " + name.charAt(i));
        // }

        // }

        if (name.equals(name2)) {
            System.out.println("the 2 names are equal");
        } else {
            System.out.println("they are not equal");
        }

        System.out.println(name.compareTo(name2));
        boolean b = name.contains(name2);
        System.out.println(b);

        System.out.println(name.toUpperCase());
        System.out.println(name2.toUpperCase());

    }

}