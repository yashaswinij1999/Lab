public class noOfCharacters {

    public static void main(String[] args) {

        String str = "Good Morning123";
        int vowels = 0;
        int constants = 0;
        int digits = 0;
        int specialCharacter = 0;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {

                c = Character.toLowerCase(c);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    constants++;
                }

            } else {

                if (c >= '0' && c <= '9') {

                    digits++;

                } else {

                    specialCharacter++;

                }
            }

        }

        System.out.println(" no of vowels = " + vowels);
        System.out.println(" no of constants = " + constants);
        System.out.println(" no of digits = " + digits);
        System.out.println(" no of specialCharacter = " + specialCharacter);

    }

}
