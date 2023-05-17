import java.sql.Struct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable {

    private String name;
    private String id;
    private int age;

    public Student() {

    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        if (id == null || id.equals("")) {
            throw new IllegalArgumentException("Invalid id");
        }
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object o1) {

        if (o1 instanceof Student) {
            Student st = (Student) o1;

            if (this.name.equals(st.name) || this.id.equals(st.id) || this.age == st.age) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (name + id + age).hashCode();
    }

    public String toString() {
        return "Student :" + name + "," + "id = " + id + "," + "age= " + age;
    }

    public int compareTo(Object o1) {

        if (o1 instanceof Student) {

            Student st1 = (Student) o1;
            return this.age - st1.age;

        }
        throw new IllegalArgumentException("Invalid object ");
    }

}

class TestStudent {

    public static void main(String[] args) {

        Student st1 = new Student("Arjuna", "1", 10);
        Student st2 = new Student("Yudhisthira", "2", 12);
        Student st3 = new Student("Bhima", "3", 2);
        Student st4 = new Student("Nakula", "4", 12);
        Student st5 = new Student("Sahadeva", "5", 22);
        Student st6 = new Student("Arjuna", "1", 10);

        StudentNameComparator snc = new StudentNameComparator();
        List<Student> l = new ArrayList<Student>();
        l.add(st1);
        l.add(st2);
        l.add(st3);
        l.add(st4);
        l.add(st5);
        l.add(st6);
        System.out.println("l ==== " + l);
        

        Set<Student> s1 = new HashSet<>();
        s1.add(st1);
        s1.add(st2);
        s1.add(st3);
        s1.add(st4);
        s1.add(st5);
        s1.add(st6);
        System.out.println("s1 === > " + s1);

        Set<Student> ts = new TreeSet<>(snc);
        ts.add(st1);
        ts.add(st2);
        ts.add(st3);
        ts.add(st4);
        ts.add(st5);
        ts.add(st6);
        System.out.println("ts ===> " + ts);

    }
}

class StudentNameComparator implements Comparator {

    public int compare(Object o1, Object o2) {

        if (o1 instanceof Student && o2 instanceof Student) {

            Student s1 = (Student) o1;
            Student s2 = (Student) o2;

            return s1.compareTo(s2);
        }
        throw new IllegalArgumentException("Invalid reference");
    }
}