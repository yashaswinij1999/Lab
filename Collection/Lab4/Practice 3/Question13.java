import java.util.HashMap;

public class Question13 {

    public static void main(String[] args) {

        YashuMap<String, Integer> yashu = new YashuMap<String, Integer>();
        yashu.put("palu", 45);
        yashu.put("srivi", 28);
        yashu.get("srivi");
        System.out.println("putCount " + yashu.getPutCount());
        System.out.println("getCount " + yashu.getGetCount());

    }
}

class YashuMap<K, V> extends HashMap<K, V> {

    public static int putCount = 0;
    public static int getCount = 0;

    @Override
    public V get(Object key) {
        // TODO Auto-generated method stub

        getCount++;
        return super.get(key);
    }

    @Override
    public V put(K key, V value) {

        // TODO Auto-generated method stub
        putCount++;
        return super.put(key, value);
    }

    public int getPutCount() {

        return putCount;

    }

    public int getGetCount() {

        return getCount;

    }

}