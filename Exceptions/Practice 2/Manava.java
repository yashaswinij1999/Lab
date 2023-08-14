public class Manava {

    private String name;
    private int age;

    public void setName(String name) {

        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Invalid name");
        } else {
            this.name = name;
        }

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {

        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Invalid age");
        } else {
            this.age = age;
        }

    }

    public int getAge() {

        return age;

    }

    public void dance(String type) throws DanceFailureException {

        if (age > 50) {

            if (type == "salsa") {
                throw new DanceFailureException("Invalid type");
            }

        }

    }

}

class TestM {

    public static void main(String[] args) {

        try {

            Manava m = new Manava();
            m.setAge(59);
            m.dance("salsa");

        } catch (DanceFailureException e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}

class DanceFailureException extends Exception {

    public DanceFailureException() {

    }

    public DanceFailureException(String msg) {

        super(msg);

    }

}