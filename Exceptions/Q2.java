public class Q2 {

    public static void main(String[] args) {

        try {

            Person p = null;
            p.name = "ram";
            System.out.println("name = " + p.name);

            Thing t = new Vehicle();
            Tool ti = (Tool) t;
            ti.drive();

            String s = "one";
            int i = Integer.parseInt(s);
            System.out.println(i);

            System.out.println(10/0);

            int[] arr = new int[Integer.MAX_VALUE];

        } catch (Throwable e) {

            e.printStackTrace();

        }

    }

}

class Person {

    String name;

}

interface Thing {

    public void doSomething();

}

class Tool implements Thing {

    public void doSomething() {
        System.out.println("Thing do Something");
    }

    public void drive() {
        System.out.println("the vehicle will drive");
    }
}

class Spanner extends Tool {

    public void doSomething() {
        System.out.println("spanner do something");
    }

}

class TubeLight implements Thing {

    public void doSomething() {
        System.out.println("renders light when you ask it to do something");
    }
}

class Vehicle implements Thing {

    String name;

    public void doSomething() {
        System.out.println("the vehicle will drive");
    }

}
