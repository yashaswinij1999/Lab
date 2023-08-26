import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable {

    String name;
    int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o) {

        if (o instanceof Student) {

            Student s = (Student) o;

            if (this.name.equals(s.name) && this.age == s.age) {
                return true;
            }

        }
        return false;

    }

    public int hashCode() {

        return (name + age).hashCode();

    }

    public String toString() {

        return "name :" + name + " age : " + age;

    }

    public int compareTo(Object o) {

        if (o instanceof Student) {

            Student s = (Student) o;

            return this.age - s.age;

        }
        throw new IllegalArgumentException("Invalid Input");

    }

}

class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student("rama", 10);
        Student s2 = new Student("seetha", 5);
        Student s3 = new Student("hanuman", 12);
        Student s4 = new Student("laxman", 18);
        Student s5 = new Student("rama", 21);

        List<Student> l = new ArrayList<>();
        StringNameComparator sc = new StringNameComparator();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        l.add(s5);
        Collections.sort(l, sc);
        System.out.println("elements in list " + l);

        Set<Student> st = new HashSet<>();
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        // System.out.println("elements in set " + st);

        TreeSet<Student> ts = new TreeSet<>(sc);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        // System.out.println("elements in treeSet " + ts);

    }

}
