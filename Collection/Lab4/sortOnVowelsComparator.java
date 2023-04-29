import java.util.Comparator;

public class sortOnVowelsComparator implements Comparator {

    public int compare(Object o1, Object o2) {

        if (o1 instanceof String && o2 instanceof String) {
            String s1 = (String) o1;
            String s2 = (String) o2;
            int vowels1 = 0;
            int vowels2 = 0;

            for (int i = 0; i < s1.length(); i++) {

                char c = s1.charAt(i);

                if (Character.isLowerCase(c)) {

                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowels1++;
                    }
                }
            }

            for (int i = 0; i < s2.length(); i++) {

                char c = s2.charAt(i);

                if (Character.isLowerCase(c)) {

                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowels2++;
                    }
                }
            }
            return vowels1 - vowels2;

        }
        throw new IllegalArgumentException();
    }

}
