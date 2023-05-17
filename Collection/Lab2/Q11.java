import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Q11 {

    public static void main(String[] args) {

        StudentAgeDescendingComparator sad = new StudentAgeDescendingComparator();
        StudentNameComparator snc = new StudentNameComparator();

        Student s1 = new Student("Bhima", "1", 12);
        Student s2 = new Student("Divya", "2", 5);
        Set<Student> str = new TreeSet<>(sad);
        str.add(s1);
        str.add(s2);

        List l = new ArrayList<>();
        l.add(s1);
        l.add(s2);
        Collections.sort(l, snc);

        System.out.println("comparison based on name == " + l);
        System.out.println("comparison based on age === >" + str);

    }

}

class StudentAgeDescendingComparator implements Comparator {

    public int compare(Object o1, Object o2) {

        if (o1 instanceof Student && o2 instanceof Student) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;

            return s2.getAge() - s1.getAge();
        }
        throw new IllegalArgumentException("Invalid reference");
    }

}
