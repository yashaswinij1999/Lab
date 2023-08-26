import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q4 {

    public static void main(String[] args) {

        List<Person> l = new ArrayList<>();

        Person p1 = new Person("Rama", 21);
        Person p2 = new Person("Seetha", 22);
        Person p3 = new Person("Rama", 21);

        l.add(p1);
        l.add(p2);
        l.add(p3);

        Iterator it = l.iterator();

        while (it.hasNext()) {

            Object o = it.next();

            if (o instanceof Person) {

                Person p5 = (Person) o;

                if (p5.equals(p3)) {
                    it.remove();
                }

            }

        }

        System.out.println(l);

    }

}
