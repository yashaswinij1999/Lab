
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class CountryandCapital {

    TreeMap<String, String> t = new TreeMap<>();
    Map<String, String> m = new java.util.HashMap<>();

    public void addCountryandCapital(String country, String capital) {

        t.put(country, capital);
        m.put(country, capital);
    }

    public String[] getDetails() {

        String[] details = new String[m.size()];
        Set<String> keys = m.keySet();
        int count = 0;

        for (String str : keys) {

            details[count++] = str + " " + m.get(str);

        }
        return details;

    }

    public String searchCapital(String country) {

        Set<String> s = m.keySet();
        String result = "";

        for (String str : s) {

            if (str.equals(country)) {
                result = m.get(str);
            }

        }

        return result;
    }

    public String[] sortCountry() {

        String[] details = new String[t.size()];
        Set<String> s = t.keySet();
        int count = 0;

        for (String str : s) {
            details[count++] = str + " " + t.get(str);
        }
        return details;

    }

    public void sortOnValue() {

        Map<String, String> m1 = new TreeMap<>(new SortOnValueComparator(m));

        Set<Entry<String,String>> s = m.entrySet();

        for(Entry<String,String> e : s){
            m1.put(e.getKey(), e.getValue());
        }
        System.out.println(m1);


    }

}
