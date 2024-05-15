
import java.util.ArrayList;

public class Q4 {

    public static void main(String[] args) {

        Person p1 = new Person("rama", 10);
        Person p2 = new Person("sita", 5);
        Person p3 = new Person("ranga", 6);
        Person p4 = new Person("keshava", 7);
        Person p5 = new Person("rama", 10);

        ArrayList l = new ArrayList<Person>();
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);
        l.add(p5);
        System.out.println(l);
        
    }

}
