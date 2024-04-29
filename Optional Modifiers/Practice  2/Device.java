
public abstract class Device {

    public Device() {
        System.out.println("no arg constuctor in Device");
    }

    public static void test() {
        System.out.println("testing device");
    }

    public abstract void doSomething();

}

abstract class Phone extends Device {

    public abstract void call(String number);

}

class MobilePhone extends Phone {

    public MobilePhone() {
        System.out.println("No arg constuctor in MobilePhone");
    }

    @Override
    public void doSomething() {
        System.out.println("A Mobile Phone can do something");
    }

    @Override
    public void call(String number) {
        System.out.println("We can make a call through phone");

    }

}

class Person {

    public void use(Device d) {
        d.doSomething();
    }

}

class TestDevice {

    public static void main(String[] args) {

        // Device.test();
        // Person p = new Person();
        // MobilePhone m = new MobilePhone();
        // p.use(m);

    }

}
