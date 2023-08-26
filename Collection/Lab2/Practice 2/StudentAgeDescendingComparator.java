import java.util.Comparator;

public class StudentAgeDescendingComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        if (o1 instanceof Student && o2 instanceof Student) {

            Student s1 = (Student) o1;
            Student s2 = (Student) o2;

            return s2.age - s1.age;

        }
        // TODO Auto-generated method stub
        throw new IllegalArgumentException("Invalid reference");
    }

}