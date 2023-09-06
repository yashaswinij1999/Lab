import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class noOfItems {

    public static void main(String[] args) {

        List<String> l = new ArrayList<String>();
        noOfItems nof = new noOfItems();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter the sentence ");
        String sentence = sc2.nextLine();

        String[] words = sentence.split(" ");

        for (String s : words) {

            l.add(s);

        }
        System.out.println(" words = " + l);
        System.out.println("no of words = " + l.size());

    }
}
