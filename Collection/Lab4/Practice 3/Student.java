import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeSet;

public class Student implements Comparable {

    String name;
    Date dob;

    public Student(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public Student() {
    }

    public void setName(String name) {

        if (name.equals(" ") || name == null) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }

    }

    public String setName() {
        return name;
    }

    public void setDob(Date dob) {

        Date t = new Date();

        if (dob.before(t) || dob.equals(t)) {
            this.dob = dob;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Date getDate() {
        return dob;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", dob=" + dob + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((dob == null) ? 0 : dob.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (dob == null) {
            if (other.dob != null)
                return false;
        } else if (!dob.equals(other.dob))
            return false;
        return true;
    }

    public int compareTo(Object o1) {

        if (o1 instanceof Student) {

            Student s1 = (Student) o1;

            return this.getDate().compareTo(s1.getDate());

        }
        throw new IllegalArgumentException();

    }

}

class TestStudent {

    public static void main(String[] args) {

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date dt1 = sdf.parse("12-05-2023");
            Date dt2 = sdf.parse("10-05-2023");

            Student s1 = new Student("Raju", dt1);
            Student s2 = new Student("Raju", dt2);

            TreeSet<Student> st = new TreeSet<>();
            st.add(s1);
            st.add(s2);
            System.out.println(st);

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}
