import java.util.Scanner;
import java.util.TreeSet;

public class Q6 {

    public static void main(String[] args) {

        int ch = 0;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("enter the sentence");
        String sentence = sc2.nextLine();

        String[] split = sentence.split(" ");

        StringLengthComparator slc = new StringLengthComparator();
        StringAplhabeticalOrder sao = new StringAplhabeticalOrder();
        reverseAlphabetsComparator sac = new reverseAlphabetsComparator();
        basedOnNumberOfAlphabetsComparator vowels = new basedOnNumberOfAlphabetsComparator();
        TreeSet<String> st;

        while (ch != 5) {

            System.out.println("");
            System.out.println("press 1 to sort based on length");
            System.out.println("press 2 to sort based on Alhabetical order");
            System.out.println("press 3 to sort based on reverse aplhabetical order");
            System.out.println("press 4 to sort baased on numbaer of vowels in each word");
            System.out.println("press 5 to exit");
            System.out.println("");

            ch = sc1.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("to sort on length");
                    System.out.println("");

                    st = new TreeSet<>(slc);

                    for (String str : split) {

                        st.add(str);

                    }

                    System.out.println("sorted based on length : " + st);
                    break;

                case 2:
                    System.out.println("sort on alphabets");
                    System.out.println("");

                    st = new TreeSet<>(sao);

                    for (String str : split) {

                        st.add(str);

                    }

                    System.out.println("sorted based on alphabets : " + st);
                    break;

                case 3:
                    System.out.println("to sort on reverse aplhabets");
                    System.out.println("");

                    st = new TreeSet<>(sac);

                    for (String str : split) {

                        st.add(str);

                    }

                    System.out.println("sorted based on reverse alphabets : " + st);

                    break;

                case 4:
                    System.out.println("to sort on number of vowels");
                    System.out.println("");

                    st = new TreeSet<>(vowels);

                    for (String str : split) {

                        st.add(str);

                    }

                    System.out.println("sorted based on vowels : " + st);
                    break;

                default:
                    System.out.println("invalid input");
                    System.out.println("");
                    break;

                case 5:

                    System.out.println("to exit");
            }

        }

    }

}
