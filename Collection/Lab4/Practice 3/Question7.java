import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Please enter the sentence");
        String sentence = sc.nextLine();

        String[] arr = sentence.split(" ");

        List<String> l = new ArrayList<>();

        for (String s : arr) {
            l.add(s);
        }

        System.out.println("the no of elements in a sentence : " + l.size());

    }

}
