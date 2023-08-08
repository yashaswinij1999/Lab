public class Device {

    private String name;

    public Device() {
        super();
    }

    public Device(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void doSomething() {

        System.out.println("a device " + name + " can do something");

    }

}

class Tv extends Device {

    public Tv() {
        super();
    }

    public Tv(String name) {
        super("Onida");
    }

    public void doSomething() {

        System.out.println("a tv " + getName() + " is used to watch movie ");

    }

    public void switchChannel() {

        System.out.println("a tv is used to switch channel ");

    }

}

class Printer extends Device {

    public Printer(String name) {
        super(name);
    }

    public void doSomething() {

        System.out.println(" Printer " + getName() + " is used to print ");

    }

}

class MicroWave extends Device {

    public MicroWave(String name) {
        super(name);
    }

    public void doSomething() {

        System.out.println("Using microwave " + getName() + " we can cook ");

    }

}

class Electrician {

    public void test(Device d) {

        d.doSomething();

        if (d instanceof Tv) {

            Tv t = (Tv) d;
            t.doSomething();
            t.switchChannel();

        }

    }

}

class TestDevice {

    public static void main(String[] args) {

        Device d = new Device("Computer");
        // d.doSomething();

        Tv t = new Tv("LG");
        // t.doSomething();

        MicroWave m = new MicroWave("Onida");
        // m.doSomething();

        Printer p = new Printer("Canan");
        // p.doSomething();

        Electrician e = new Electrician();
        e.test(t);
        e.test(p);
        e.test(m);

        d = new Printer("Canon");
        // d.doSomething();

        // System.out.println("d instance of Microwave? " + (d instanceof MicroWave));
        // System.out.println("d instance of Printer? " + (d instanceof Printer));
        // System.out.println("d instance of TV? " + (d instanceof Tv));
        // System.out.println("d instance of Device? " + (d instanceof Device));

    }

}