import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Comparator;

public class CountryandCapital {

    private Map<String, String> m1 = new LinkedHashMap<String, String>();
    private Map<String, String> m2 = new TreeMap<String, String>();

    public void addCountryandCapitalName(String Country, String Capital) {

        m1.put(Country, Capital);
        m2.put(Country, Capital);

        // System.out.println(" m1 ====> " + m1);
        // System.out.println(" m2 ====> " + m2);

    }

    public String getCapital(String Country) {

        return m1.get(Country);

    }

    public String[] getAllDetails() {

        String[] details = new String[m1.size()];
        Set<String> st = m1.keySet();
        int count = 0;

        for (String s : st) {

            details[count] = s + "" + m1.get(s);
            count++;

        }
        return details;

    }

    public String[] sortedDetails() {

        if (m2.size() == 0)
            return null;

        String[] details = new String[m2.size()];
        Set<String> set = m2.keySet();
        int count = 0;
        for (String s : set) {

            details[count] = s + "" + m2.get(s);
            count++;

        }
        return details;

    }

}
