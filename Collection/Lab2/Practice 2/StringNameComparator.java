import java.util.Comparator;

public class StringNameComparator implements Comparator<Student> {

    public int compare(Student o1, Student o2) {

        if (o1 instanceof Student && o2 instanceof Student) {

            return o1.name.compareTo(o2.name);

        }
        throw new IllegalArgumentException();
    }

}