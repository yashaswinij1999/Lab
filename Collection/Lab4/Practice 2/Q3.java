import java.util.HashSet;
import java.util.Set;

public class Q3 {

    public static void main(String[] args) {
        
        String sentence = "this this is is a a can you can";
        String [] split = sentence.split(" ");

        Set<String>s = new HashSet<>();
        for(String str : split){
            s.add(str);
        }

        System.out.println("s == > " + s);

    }
    
}
