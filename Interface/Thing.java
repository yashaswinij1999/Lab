public interface Thing {

    public void doSomething();

}

class Tool implements Thing {

    public void doSomething() {
        System.out.println("Thing do Something");
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

class Manava {

    public void TestThing(Thing t) {
        if (t instanceof Vehicle) {
            Vehicle v = (Vehicle) t;
            v.doSomething();
        }

    }
}

class TestThing {

    public static void main(String[] args) {
        Thing t = new Spanner();
        t.doSomething();

        Tool to = new Spanner();
        to.doSomething();

        Spanner sp = new Spanner();
        sp.doSomething();

        Manava m = new Manava();
        m.TestThing(t);

        Thing t2 = new Vehicle();
        m.TestThing(t2);
    }
}