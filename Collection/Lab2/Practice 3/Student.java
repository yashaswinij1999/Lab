
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Student implements Comparable {

    String name;
    String id;
    int age;

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public boolean equals(Object e) {

        if (e instanceof Student) {

            Student s = (Student) e;

            if (this.name.equals(s.name) && this.id.equals(s.id) && this.age == s.age) {
                return true;
            }

        }
        return false;

    }

    public int hashCode() {
        return (name + id + age).hashCode();
    }

    public String toString() {
        return name + " " + id + " " + age;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {

            Student s = (Student) o;

            return this.age - s.age;

        }
        throw new IllegalArgumentException("invalid object type");
    }

}

class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student("rama", "rama@1", 10);
        Student s2 = new Student("sita", "sita@11", 20);
        Student s3 = new Student("shama", "shamaa@12", 15);
        Student s4 = new Student("bhama", "bhama@1", 40);
        Student s5 = new Student("coma", "coma@1", 30);
        Student s6 = new Student("rama", "rama@1", 10);

        // ArrayList l = new ArrayList<>();
        // HashSet l = new HashSet<>();
        // LinkedHashSet l = new LinkedHashSet();
        
        TreeSet l = new TreeSet<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        l.add(s5);
        l.add(s6);

        for (Object o : l) {

            if (o instanceof Student) {
                Student s = (Student) o;
                System.out.println(s);
            }

        }

    }
}
