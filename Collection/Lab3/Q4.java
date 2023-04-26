
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q4 {

    public static void main(String[] args) {

        Map<String, String> m = new TreeMap<String, String>();

        m.put("India", "delhi");
        m.put("Karntaka", "Bangalore");
        m.put("Kerala", "Cochi");
        m.put("Maharastra", "Mumbai");
        m.put("TamilNadu", "Chennai");

        System.out.println("m ---> " + m);
        System.out.println(" m.get(Kerala) = " + m.get("Kerala"));
        System.out.println(" m.remove(India) = " + m.remove("India"));
        System.out.println(" m.entrySet() = " + m.entrySet());
        System.out.println(" m.keySet() = " + m.keySet());
        System.out.println(" m.values() = " + m.values());
        System.out.println("m.containsKey(India) = " + m.containsKey("India"));
        System.out.println(" m.containsValue(Delhi) = " + m.containsValue("Delhi"));

    }

}