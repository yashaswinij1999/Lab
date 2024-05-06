
public interface Thing {

    public void doSomething();

}

class Tool implements Thing {

    @Override
    public void doSomething() {
        // TODO Auto-generated method stub
        System.out.println("Thing doing something");

    }

}

class Spanner extends Tool {

    @Override
    public void doSomething() {
        // TODO Auto-generated method stub
        System.out.println("Spanner doing something");

    }

}

class Vehicle implements Thing {

    String name;

    @Override
    public void doSomething() {
        System.out.println("A vehicle can drive");
    }

}

class Person {

    public void testThing(Thing t) {
        t.doSomething();
    }

}

class TestThing {

    public static void main(String[] args) {

        /* 
        Thing t = new Spanner();
        t.doSomething();

        Tool tl = new Spanner();
        tl.doSomething();

        Spanner s1 = new Spanner();
        s1.doSomething();

        Vehicle v = new Vehicle();

        Person p = new Person();
        p.testThing(s1);
        p.testThing(v);
         */
    }

}
