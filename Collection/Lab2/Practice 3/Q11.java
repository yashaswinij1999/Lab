
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Q11 {

    public static void main(String[] args) {

        Student s1 = new Student("rama", "rama@1", 10);
        Student s2 = new Student("sita", "sita@11", 20);
        Student s3 = new Student("shama", "shamaa@12", 15);
        Student s4 = new Student("bhama", "bhama@1", 40);
        Student s5 = new Student("coma", "coma@1", 30);
        Student s6 = new Student("rama", "rama@1", 10);

        StringNameComparator snc = new StringNameComparator();
        StudentAgeDescend sad = new StudentAgeDescend();

        ArrayList l = new ArrayList<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        l.add(s5);
        l.add(s6);

        Collections.sort(l, sad);
        System.out.println(l);
    }

}
