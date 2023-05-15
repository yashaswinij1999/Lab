import java.util.ArrayList;
import java.util.Collection;

public class Q4 {

    public static void main(String[] args) {

        Collection col = new ArrayList<>();

        Person p1 = new Person("ram", 2);
        Person p2 = new Person("ranga", 5);
        Person p3 = new Person("shama", 6);
        Person p4 = new Person("bhama", 7);
        Person p5 = new Person("vittal", 3);

        col.add(p1);
        col.add(p2);
        col.add(p3);
        col.add(p4);
        col.add(p5);
        
        System.out.println(col);
        System.out.println("col.contains(p3) = " + col.contains(p3));
        System.out.println("col.remove(p4) = " + col.remove(p4));

    }

}
