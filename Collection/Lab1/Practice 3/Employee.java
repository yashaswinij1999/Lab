
public class Employee {

    String name;
    String email;
    Address homAddress;
    Address offAddress;

    public Employee(String name, String email, Address homAddress, Address offAddress) {
        this.name = name;
        this.email = email;
        this.homAddress = homAddress;
        this.offAddress = offAddress;
        System.out.println("parameterised constructor in Employee");
    }

    public boolean equals(Object o) {

        if (o instanceof Employee) {

            Employee e1 = (Employee) o;

            if (this.name.equals(e1.name) && this.email.equals(e1.email) && this.homAddress.equals(e1.homAddress) && this.offAddress.equals(e1.offAddress)) {
                return true;
            }

        }
        return false;
    }
}

class TestEmployee {

    public static void main(String[] args) {

        Address homAddress1 = new Address("Bangalore", "Kottigepalya", "566091");
        Address offAddress1 = new Address("Bangalore", "Hebbal", "560011");

        Address homAddress2 = new Address("Tumkur", "Ammasandra", "566011");
        Address offAddress2 = new Address("Tumkur", "Mg Road", "560065");

        Employee e1 = new Employee("rama", "rama@gmaol.com", homAddress1, offAddress1);
        Employee e2 = new Employee("arjuna", "arjuna@gmaol.com", homAddress2, offAddress2);

    }

}
