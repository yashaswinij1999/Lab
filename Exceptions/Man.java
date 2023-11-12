public class Man {

    int age;

    public void setAge(int a) {
        if (a < 0 || a > 100)
            throw new IllegalArgumentException("Is this person born or is he already dead? ");
    }

    public int getAge() {
        return age;
    }

    public void dance(String dance) throws DanceFailureException {
        if (age > 50) {
            System.out.println(dance);
        } else {
            throw new DanceFailureException("invalid dance type");
        }
    }
}

class testMan {

    public static void main(String[] args) {
        Man m = new Man();
        m.setAge(14);
        System.out.println(m.getAge());

        try {
            m.dance("slasa");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}

class DanceFailureException extends Exception {

    public DanceFailureException() {

    }

    public DanceFailureException(String dance) {

    }

}