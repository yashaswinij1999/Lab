import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

    String name;
    String email;
    Date dob;
    Adress hoAdress;
    Adress offAdress;

    public Employee() {

    }

    public Employee(String name, String email, Date dob, Adress hoAdress, Adress offAdress) {

        this.name = name;
        this.email = email;
        this.dob = dob;
        this.hoAdress = hoAdress;
        this.offAdress = offAdress;

    }

    public boolean equals(Employee e) {

        if (e instanceof Employee) {

            if (this.name.equals(e.name) && this.email.equals(e.email) && this.dob == e.dob
                    && this.hoAdress.equals(e.hoAdress) && this.offAdress.equals(e.offAdress)) {

                return true;

            }

        }
        return false;

    }

    public int hashCode() {

        return (name + email + dob + hoAdress + offAdress).hashCode();

    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", email=" + email + ", dob=" + dob + ", hoAdress=" + hoAdress
                + ", offAdress=" + offAdress + "]";
    }

}

class TestEmployes {

    public static void main(String[] args) {

        Adress homAdress = new Adress("bangalore", "Kottigepalay", "560091", "magadi");
        Adress oofAdress = new Adress("bangalore", "Hebbala", "560055", "kodigehalli");

        Adress homAdress1 = new Adress("bangalore", "Kottigepalay", "560091", "magadi");
        Adress oofAdress2 = new Adress("bangalore", "Hebbala", "560055", "kodigehalli");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date d = null;

        try {

            d = sdf.parse("12/09/2022");

        } catch (ParseException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();

        }

        Employee e1 = new Employee("Raju", "raju@gmail.com", d, homAdress, oofAdress);
        Employee e2 = new Employee("Raju", "raju@gmail.com", d, homAdress, oofAdress);

        System.out.println(e1.equals(e2));

    }

}
