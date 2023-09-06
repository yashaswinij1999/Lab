import java.util.Comparator;

public class basedOnNumberOfAlphabetsComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        int vowels1 = 0;
        int vowels2 = 0;

        // TODO Auto-generated method stub

        if (o1 instanceof String && o2 instanceof String) {

            String s1 = (String) o1;
            String s2 = (String) o2;

            for (int i = 0; i < s1.length(); i++) {

                char c = s1.charAt(i);

                if (Character.isLowerCase(c)) {
                    vowels1++;
                }

            }

            for (int i = 0; i < s2.length(); i++) {

                char c = s2.charAt(i);

                if (Character.isLowerCase(c)) {
                    vowels2++;
                }

            }

            return vowels1 - vowels2;

        }
        throw new IllegalArgumentException();

    }

}
