
public class Device {

    private String name;

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Device() {
        System.out.println("no arg constructor in Device");
    }

    public Device(String name) {
        this.name = name;
        System.out.println("parameterised constructor in Device");
    }

    public void doSomething() {
        System.out.println(getName() + " A device can do something ");
    }

}

class Tv extends Device {

    public void doSomething() {
        System.out.println(getName() + " A Tv can do something ");
    }

    public void switchChannel() {
        System.out.println("using tv wee can switch channel");
    }

    public Tv() {
        System.out.println("no arg constructor in Tv");
    }

    public Tv(String name) {
        super(name);
        System.out.println("parameterised constructor in Tv");
    }

}

class Printer extends Device {

    public void doSomething() {
        System.out.println(getName() + " A Printer can do something ");
    }

    public Printer() {
        System.out.println("no arg constructor in Printer");
    }

    public Printer(String name) {
        super(name);
        System.out.println("parameterised constructor in Printer");
    }

}

class Microwave extends Device {

    public void doSomething() {
        System.out.println(getName() + " A Microwave can do something ");
    }

    public Microwave() {
        System.out.println("no arg constructor in Microwave");
    }

    public Microwave(String name) {
        super(name);
        System.out.println("parameterised constructor in Microwave");
    }

}

class Electrician {

    public void testDevice(Device d) {
        if (d instanceof Tv) {
            Tv t = (Tv) d;
            t.switchChannel();
        }
    }

}

class TestDevice {

    public static void main(String[] args) {

        /* 
        Device d = new Device();
        d.name = "Davy";
        d.doSomething();

        d = new Tv();
        d.doSomething();

        Tv t = (Tv) d;
        t.switchChannel();

        d = new Printer();
        d.doSomething();

        d = new Microwave();

        d = new Tv();

        System.out.println("d instance of Microwave? " + (d instanceof Microwave));
        System.out.println("d instance of Printer? " + (d instanceof Printer));
        System.out.println("d instance of TV? " + (d instanceof Tv));
        System.out.println("d instance of Device? " + (d instanceof Device));
        
        Electrician e = new Electrician();
        Tv t = new Tv();
        // Printer p = new Printer();
        // Microwave m = new Microwave();

        t.setName("tvvvy");
        t.doSomething();
        e.testDevice(t);
         */
    }

}
