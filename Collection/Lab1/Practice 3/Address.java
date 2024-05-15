
public class Address {

    String city;
    String street;
    String pin;

    public Address(String city, String street, String pin) {
        this.city = city;
        this.street = street;
        this.pin = pin;
        System.out.println("parameterised contructor in address class");
    }

    public boolean equals(Object e) {

        if (e instanceof Address) {

            Address a = (Address) e;
            if (this.city.equals(a.city) && this.street.equals(a.street) && this.pin.equals(a.pin)) {
                return true;
            }

        }
        return false;

    }


}
