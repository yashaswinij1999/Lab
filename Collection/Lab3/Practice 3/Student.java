import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

public class Student implements Comparable {

    String name;
    Date dob;
    String email;
    String id;
    List<Student> l = new ArrayList<>();
    TreeSet<Student> ts = new TreeSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student() {

    }

    public Student(String name, Date dob, String email, String id) {
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.id = id;
    }

    public boolean equals(Object o1) {

        if (o1 instanceof Student) {

            Student s1 = (Student) o1;

            if (this.name.equals(s1.name) && this.dob == s1.dob && this.email.equals(s1.email)
                    && this.id.equals(s1.id)) {
                return true;
            }

        }
        return false;
    }

    public int hashCode() {

        return (name + dob + email + id).hashCode();

    }

    public String toString() {

        return "name:" + name + " dob : " + dob + " email :" + email + " id : " + id;
    }

    public void addStudents(Student st) {

        l.add(st);
        ts.add(st);
        // System.out.println("student added to the list sucessFully");
        // System.out.println(ts);

    }

    public void getInfo(String id) {

        for (Student s : l) {

            if (s.getId().equals(id)) {

                System.out.println(s);

            } else {

                System.out.println("id not found");

            }

        }

    }

    public void getAllDetailsOfStudent() {

        System.out.println(l);

    }

    public int compareTo(Object o1) {

        if (o1 instanceof Student) {

            Student st1 = (Student) o1;

            return this.dob.compareTo(st1.getDob());

        }
        throw new IllegalArgumentException("Invalid Object reference");

    }

    public String sortStudentBasedOnDateOfBirth() {

        String str = "";

        for (Student s : ts) {

            str = s.getId() + s.getEmail() + s.getDob() + s.getId() + " " + str;

        }
        return str;

    }

}

class TestStudent {

    public static void main(String[] args) {

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

            TreeSet<Student> ts = new TreeSet<>();

            String date1 = "06-06-1972";
            Date dt1 = sdf.parse(date1);

            String date2 = "19-09-2001";
            Date dt2 = sdf.parse(date2);

            String date3 = "2015-20-5";
            Date dt3 = sdf.parse(date3);

            Student st = new Student();

            Student st1 = new Student("yashu", dt1, "yashu@gmail.com", "G11011");
            Student st2 = new Student("ramya", dt2, "ramya@gmail.com", "G11012");
            Student st3 = new Student("palu", dt3, "palu@gmail.com", "G11013");

            st.addStudents(st1);
            st.addStudents(st2);
            st.addStudents(st3);

            String s = st.sortStudentBasedOnDateOfBirth();
            System.out.println(s);

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}