import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Q9 {

    public static void main(String[] args) {

        Map<String, String> ts = new TreeMap<String, String>();
        ts.put("one", "ondh");
        ts.put("nine", "eradu");
        ts.put("six", "muru");
        ts.put("five", "nalaku");
        ts.put("four", "hidu");
        ts.put("three", "haru");
        ts.put("two", "helu");
        ts.put("seven", "entu");
        ts.put("ten", "vabatu");
        ts.put("eight", "hatu");

        System.out.println("ts =====> " + ts);

        // uncomment SortByValueComparator to see the result;

        Map<String, String> sort = new TreeMap<String, String>(new SortByValueComparator(ts));
        Set<Entry<String, String>> st = ts.entrySet();

        for (Entry<String, String> en : st) {

            sort.put(en.getKey(), en.getValue());
            
        }
        System.out.println(" sorting based on value is String " + sort);

    }

}
