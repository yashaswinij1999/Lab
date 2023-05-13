public class Device {

    private String name;

    public void setName(String name) {

        if (name == null || name.equals("")) {
            throw new IllegalArgumentException();
        }
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public Device() {

        System.out.println("no arg constructor in device class");

    }

    public Device(String name) {
        super();
        System.out.println(" param constructor in device class");

    }

    public void doSomething() {

        System.out.println("a device can do something " + name);

    }

}

class Tv extends Device {

    public Tv(String name) {
        super(name);
        System.out.println(" param constructor in Tv class");

    }

    public Tv() {

        System.out.println("no arg constructor in Tv class");

    }

    public void doSomething() {

        System.out.println("using tv we can watch movie " + getName());

    }

    public void switchChannel() {

        System.out.println("using tv we can switvh channel");

    }

}

class Printer extends Device {

    public Printer(String name) {
        super(name);
        System.out.println(" param constructor in Printer class");

    }

    public Printer() {

        System.out.println("no arg constructor in Printer class");

    }

    public void doSomething() {

        System.out.println("using Printer we can print " + getName());

    }

}

class Microwave extends Device {

    public Microwave(String name) {
        super(name);
        System.out.println(" param constructor in Microwave class");

    }

    public Microwave() {

        System.out.println("no arg constructor in Microwave class");

    }

    public void doSomething() {

        System.out.println("using Microwave we can cook " + getName());

    }

}

class Electrician {

    public Electrician() {

        System.out.println("no argument constr in Electrician class");

    }

    public void test(Device d) {
        if (d instanceof Tv) {
            Tv t = (Tv) d;
            t.doSomething();
            t.switchChannel();
        }

    }
}

class TestDevice {

    public static void main(String[] args) {

        Device d = new Device();
        d.setName("Devicia");
        d.doSomething();

        Tv t = new Tv();
        t.setName("Sony");
        t.doSomething();

        Printer p = new Printer();
        p.setName("Canon");
        p.doSomething();

        Microwave m = new Microwave();
        m.setName("Onida");
        m.doSomething();

        Electrician e = new Electrician();
        e.test(t);

    }
}