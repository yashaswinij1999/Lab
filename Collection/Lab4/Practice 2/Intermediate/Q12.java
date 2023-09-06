import java.util.HashMap;
import java.util.Map;

public class Q12 {

    public static void main(String[] args) {

        MyMap<String, Integer> m1 = new MyMap();
        m1.put("ram", 1);
        m1.put("arjuna", 2);
        System.out.println("m1.getPutCount()= " + m1.getPutCount());
        System.out.println((m1.get("ram")));
        System.out.println("m1.getCount() = " + m1.getCount());
        

    }

}

class MyMap<K, V> extends HashMap<K, V> {

    public static int putCount = 0;
    public static int getCount = 0;

    @Override
    public V put(K key, V value) {
        // TODO Auto-generated method stub
        putCount++;
        return super.put(key, value);
    }

    public int getPutCount() {
        return putCount;
    }

    @Override
    public V get(Object key) {
        // TODO Auto-generated method stub
        getCount++;
        return super.get(key);
    }

    public int getCount() {
        return getCount;
    }

}
