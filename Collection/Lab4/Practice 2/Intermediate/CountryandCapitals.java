import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountryandCapitals {

    Map<String, String> m1 = new HashMap<>();

    public void add(String country, String Capital) {
        m1.put(country, Capital);
    }

    public String getCapital(String country) {
        return m1.get(country);
    }

    public String[] getAllDetails() {

        String[] sa = new String[m1.size()];
        Set<String> s = m1.keySet();
        int count = 0;

        for (String str : s) {
            sa[count] = str + " ," + m1.get(str);
            count++;
        }
        return sa;

    }

}
