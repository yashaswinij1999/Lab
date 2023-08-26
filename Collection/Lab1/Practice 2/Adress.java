public class Adress {

    String city;
    String street;
    String pin;
    String zip;

    public Adress() {

    }

    public Adress(String city, String street, String pin, String zip) {

        this.city = city;
        this.street = street;
        this.pin = pin;
        this.zip = zip;

    }

    public boolean equals(Adress a) {

        if (a instanceof Adress) {

            if (this.city.equals(a.city) && this.pin.equals(a.pin) && this.street.equals(a.street)
                    && this.zip.equals(a.zip)) {
                return true;
            }

        }
        return false;

    }

    @Override
    public int hashCode() {

        return (city + street + zip + pin).hashCode();

    }

    @Override
    public String toString() {
        return "Adress [city=" + city + ", street=" + street + ", pin=" + pin + ", zip=" + zip + "]";
    }

}
