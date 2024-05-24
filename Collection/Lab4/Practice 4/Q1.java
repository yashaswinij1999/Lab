
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q1 {

    public static void main(String[] args) {

        String s = "this this is is a what how what is";
        String word = "is";
        int count = 0;

        String[] arr = s.split(" ");

        for (String s2 : arr) {
            if (s2.equals(word)) {
                count++;
            }

        }

        System.out.println("the word " + word + " occurs " + count + " no of times");
    }

}
