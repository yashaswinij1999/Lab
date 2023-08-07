public class noOfVowels {

    public static void main(String[] args) {

        String str = "Welcome to the World of Java";
        int vowels = 0;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            c = Character.toLowerCase(c);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }

        }
        System.out.println("the no of the vowels in the word " + str + " = " + vowels);

    }

}
