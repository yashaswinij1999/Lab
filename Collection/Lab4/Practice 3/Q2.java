public class Q2 {

    public static void main(String[] args) {

        String word = "AnimalPlantorium";
        Character c = 'a';

        characterOccursInAWord(word, c);

    }

    public static void characterOccursInAWord(String word, Character c) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            char z = word.charAt(i);

            z = Character.toLowerCase(z);

            if (Character.isLowerCase(z)) {

                if (z == c) {
                    count++;
                }
            }

        }

        System.out.println("the character : " + c + " occurs " + count + " no of times in a word " + word);

    }

}
