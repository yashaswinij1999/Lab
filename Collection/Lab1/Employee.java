public class Employee {

    String name;
    String email;
    Address homeAddress;
    Address OfficeAddress;

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        if (email == null || email.equals("")) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Employee() {

    }

    public Employee(String name, String email, Address homeAddress, Address officAddress) {
        this.name = name;
        this.email = email;
        this.homeAddress = homeAddress;
        this.OfficeAddress = officAddress;
    }

    public boolean equals(Object o1) {
        if (o1 instanceof Employee) {
            Employee e = (Employee) o1;

            if (this.name.equals(e.name) || this.email.equals(e.email) || this.homeAddress.equals(e.homeAddress)
                    || this.OfficeAddress.equals(e.OfficeAddress)) {
                return true;
            }
        }
        return false;
    }

}

class Test {

    public static void main(String[] args) {

        Address homeaddress1 = new Address("blore", "kottigepalya", "560091");
        Address officeAddress1 = new Address("Hebbal", "Kodigehalli", "56002");

        Address homeaddress2 = new Address("blore", "kottigepalya", "560091");
        Address officeAddress2 = new Address("Hebbal", "Kodigehalli", "56002");

        Employee e1 = new Employee("ram", "ram.gmail.com", homeaddress1, officeAddress1);
        Employee e2 = new Employee("ram", "ram.gmail.com", homeaddress2, officeAddress2);

        System.out.println("e1.equals(e2) = " +  e1.equals(e2));

    }
}