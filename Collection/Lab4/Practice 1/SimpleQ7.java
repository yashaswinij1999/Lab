import java.util.ArrayList;
import java.util.List;

public class SimpleQ7 {

    public static void main(String[] args) {

        String sentence = "Can you can a can as a canner can can a can";
        String word = "can";
        String[] split = sentence.split(" ");
        List<String> l = new ArrayList<String>();

        //  add to a set
        for (String s : split) {
            l.add(s);
            if (l.contains(word)) {
                l.remove(word);
            }
        }
        System.out.println("l = " + l);
        

        // converting words to a sentence
        String temp = "";
        for (String s1 : l) {
            temp = temp + " " + s1;
        }
        System.out.println(" sentence = " + temp);

    }

}
