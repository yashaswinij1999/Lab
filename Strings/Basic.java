public class Basic {

    public static void main(String[] args) {

        String s1 = new String("Rama");
        String s2 = "rama";

        System.out.println(" s1 = " + s1);
        System.out.println(" s2 = " + s2);
        System.out.println("s1.length = " + s1.length());

        String name = args[0];

        if (name.length() > 12) {
            System.out.println(" You have a very long name = " + name);
        } else {
            System.out.println(" You have a name = " + name);
        }

       
        for (int i = 0; i < name.length(); i++) {

            char c = name.charAt(i);
            // System.out.println(c);
        }

        for (int i = 0; i < name.length(); i += 2) {

            char c = name.charAt(i);
            // System.out.println(c);

        }

        for (int i = 0; i < name.length() -1; i++) {

            if(i % 2 == 0){
                char c = name.charAt(i);
                System.out.println(" c== " + c);
            }
            else{
                char c1 = name.charAt(i);
                System.out.println(" c1 == " + c1);
            }
        }

        String str1 = args[0];
        String str2 = args[1];
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.indexOf(str2));
        System.out.println(str1.toUpperCase() + str2.toUpperCase());


    }

}
