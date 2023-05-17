import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class CountryandCapital {

    Map<String, String> m = new TreeMap();

    public void add(String Country, String Capital) {
        m.put(Country, Capital);
        System.out.println(m);
    }

    public String getCapital(String country) {
        return m.get(country);
    }

    public String[] getAllDetails() {

        String[] details = new String[m.size()];
        Set<String> st = m.keySet();
        int count = 0;

        for (String str : st) {
            details[count++] = str + "," + m.get(str);

        }
        return details;
    }

    public void sort() {
        System.out.println(m);
    }

    public void sortingOnValue() {

        Map<String, String> m1 = new TreeMap(new sortValueComparator(m));
        Set<Entry<String, String>> ts = m.entrySet();

        for (Entry<String, String> entry : ts) {
            m1.put(entry.getKey(), entry.getValue());
        }
        System.out.println("sorting on value =" + m1);

    }
}

class Test {

    public static void main(String[] args) {

        CountryandCapital cc1 = new CountryandCapital();
        cc1.add("India", "Delhi");
        cc1.add("Nepal", "Kathmondu");
        cc1.add("Karnataka", "Bangalore");

        System.out.println(cc1.getCapital("India"));

        String[] details = cc1.getAllDetails();

        for (String s : details) {
            System.out.println(s);
        }

        cc1.sortingOnValue();

    }
}

class sortValueComparator implements Comparator {

    Map<String, String> m;

    public sortValueComparator(Map<String, String> m) {
        this.m = m;
    }

    public int compare(Object o1, Object o2) {

        if (o1 instanceof String && o2 instanceof String) {
            String s1 = (String) o1;
            String s2 = (String) o2;

            return m.get(s1).compareTo(m.get(s2));
        }
        throw new IllegalArgumentException("Invalid");
    }

}