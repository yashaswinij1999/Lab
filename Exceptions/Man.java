public class Man {

    int age;

    public void setAge(int a) {
        if (a < 0 || a > 100)
            throw new IllegalArgumentException("Is this person born or is he already dead? ");
    }

    public int getAge() {
        return age;
    }
}

class testMan {

    public static void main(String[] args) {
        Man m = new Man();
        m.setAge(-1);
        System.out.println(m.getAge());

    }
}