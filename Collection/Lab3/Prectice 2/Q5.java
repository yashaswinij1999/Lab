import java.util.HashMap;
import java.util.Map;

public class Q5 {

    public static void main(String[] args) {
        
        String sentence = "twinkle twinkle litle star how i wonder what you are";
        String [] split = sentence.split(" ");

        Map <String,Integer> m1 = new HashMap<>();

        for(String s:split){
            Integer occurance = m1.get(s);

            if(occurance == null){
                m1.put(s, 1);
            }
            else{
                m1.put(s, occurance + 1);
            }
        }

        System.out.println("no of occurance of word " + m1);

    }
    
}
