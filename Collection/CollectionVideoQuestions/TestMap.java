import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestMap {

    public static void main(String[] args) {

        Map<String, String> saying = new HashMap<String, String>();

        System.out.println(" size of the map before adding the entries = " + saying.size());

        saying.put(" Shollay ", " Amitabh Bachan ");
        saying.put(" KGF ", "Yash");
        saying.put(" DDLJ  ", "Shah rukh Khan");
        saying.put(" Tare samir per ", "Amir Khan");
        System.out.println("the returned value after replacing KGF with Adheera = " + saying.put(" KGF ", " Adheera "));

        saying.remove(" DDLJ  ");
        System.out.println("entries = " + saying);

        Set<String> keys = saying.keySet();
        System.out.println("printing only the keys " + keys);

        for (String s : keys) {

            if (s.contains("K")) {

                System.out.println("keys which have K in it " + s);

            }
        }

        Set<Entry<String, String>> en = saying.entrySet();

        for (Entry<String, String> entries : en) {

            String key = entries.getKey();
            String value = entries.getValue();

            if (value.contains("i")) {

                System.out.println(" key , in which the value contains the  letter i in it " + key);

            }

        }

    }
}