public interface Thing {

    public void doSomething();

}

class Tool implements Thing {

    public void doSomething() {

        System.out.println("Thing doing Something");

    }

}

class Spanner extends Tool {

    public void doSomething() {

        System.out.println("Spanner doing Something");

    }

}

class TubeLight implements Thing {

    public void doSomething() {

        System.out.println("it render light");

    }

}

class Vehicle implements Thing {

    String name;

    public void doSomething() {

        System.out.println("it will drive ");

    }

}

class Manava {

    public void testThing(Thing t) {

        t.doSomething();

    }

}

class TestThing {

    public static void main(String[] args) {

        // Thing t = new Spanner();
        // Tool to = new Spanner();

        Spanner sp = new Spanner();
        sp.doSomething();

        Vehicle v = new Vehicle();

        Manava m = new Manava();
        m.testThing(sp);

    }

}