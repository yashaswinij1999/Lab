public class Address {

    private String city;
    private String street;
    private String pin;

    public void setCity(String city) {
        if (city == null || city.equals("")) {
            throw new IllegalArgumentException("Invalid city");
        }
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        if (street == null || street.equals("")) {
            throw new IllegalArgumentException("Invalid street");
        }
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setPin(String pin) {
        if (pin == null || pin.equals("")) {
            throw new IllegalArgumentException("Invalid pin");
        }
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public Address(String city, String street, String pin) {
        this.city = city;
        this.street = street;
        this.pin = pin;

    }

    public Address() {

    }

    public boolean equals(Object e) {
        if (e instanceof Address) {
            Address a = (Address) e;

            if (this.city.equals(a.city) || this.street.equals(a.street) || this.pin.equals(a.pin)) {
                return true;
            }
        }
        return false;
    }

}
