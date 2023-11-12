import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class CountyandCapital {

    Map<String, String> m1 = new HashMap();
    TreeMap<String, String> ts = new TreeMap<>();

    public void addCountryandCapital(String country, String Capital) {

        m1.put(country, Capital);
        ts.put(country, Capital);

    }

    public String[] getAllDetails() {

        String str = "";
        String[] details = new String[m1.size()];
        int count = 0;

        Set<String> st = ts.keySet();

        for (String s : st) {

            details[count++] = s + " " + ts.get(s);

        }
        return details;

    }

    public void searchCapital(String country) {

        if (m1.containsKey(country)) {
            System.out.println("capital name = " + m1.get(country));
        } else {
            System.out.println("Unable to find the country : " + country);
        }

    }

    public void sortBasedOnValue() {

        Map<String, String> st = new TreeMap<>(new sortBasedOnValueComparator(m1));

        Set<Entry<String, String>> en = m1.entrySet();

        for (Entry<String, String> entry : en) {

            st.put(entry.getKey(), entry.getValue());

        }
        System.out.println(st);
    }

}

class TestCounty {

    public static void main(String[] args) {

        CountyandCapital cc = new CountyandCapital();
        cc.addCountryandCapital("India", "Delhi");
        cc.addCountryandCapital("srilanka", "Columbo");
        cc.addCountryandCapital("Pakistan", "Istanbul");
        cc.addCountryandCapital("Nepal", "KathMandu");
        cc.searchCapital("India");

        cc.sortBasedOnValue();

    }

}