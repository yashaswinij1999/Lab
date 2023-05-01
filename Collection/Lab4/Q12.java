import java.util.HashMap;


public class Q12 {

    public static void main(String[] args) {

        MyMap mm = new MyMap();

        mm.put("Krishna", 2);
        mm.put("ranga", 2);
        mm.put("keshava", 3);
        System.out.println(mm.getPutCount());

    }

}

class MyMap<K, V> extends HashMap<K, V> {

    private static int putCount = 0;
    private static int getCount = 0;

    @Override
    public V put(K key, V value) {
        putCount++;
        return super.put(key, value);
    }

    @Override
    public V get(Object key) {
        getCount++;
        return super.get(key);
    }

    public int getPutCount() {
        return putCount;
    }

    public int getGetCount() {
        return getCount;
    }
}