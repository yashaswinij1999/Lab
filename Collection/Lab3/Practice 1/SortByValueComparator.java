import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

// public class SortByValueComparator implements Comparator {

//     Map<String, String> en;

//     public SortByValueComparator(Map<String, String> en) {

//         this.en = en;

//     }

//     public int compare(Object o1, Object o2) {

//         if (o1 instanceof String && o2 instanceof String) {

//             String s1 = (String) o1;
//             String s2 = (String) o2;

//             return en.get(s1).compareTo(en.get(s2));
//         }
//         throw new IllegalArgumentException();
//     }

// }
class Test {

    public static void main(String[] args) {

        Map<String, Integer> ts = new TreeMap<String, Integer>();
        ts.put("one", 10);
        ts.put("nine", 8);
        ts.put("six", 1);
        ts.put("five", 9);
        ts.put("four", 6);
        ts.put("three", 3);
        ts.put("two", 5);
        ts.put("seven", 7);
        ts.put("ten", 4);
        ts.put("eight", 2);

        // System.out.println("ts =====> " + ts);

        List <Map.Entry<String, Integer>> l = new ArrayList(ts.entrySet());

        Collections.sort(l, new Comparator<Map.Entry<String, Integer>>() {

            public int compare(Map.Entry<String,Integer> en1 ,Map.Entry<String, Integer> en2){

                return en1.getValue() - en2.getValue();
            }
            
        });

        System.out.println("to sort when value is a integer " + l);


    
    }
}
