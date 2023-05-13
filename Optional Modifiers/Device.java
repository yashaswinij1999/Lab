public abstract class Device {

    public Device() {
        System.out.println("no arg constructor in device ");
    }

    public final static void eat() {
        System.out.println("a device can eat");
    }

    public abstract void doSomething();

}

abstract class Phone extends Device {

    public Phone() {
        System.out.println("no arg constructor in Phone ");
    }

    public abstract void call(String number);

}

 class MobilePhone extends Phone {

    public MobilePhone() {
        System.out.println("no arg constructor in MobilePhone ");
    }

    public void doSomething() {
        System.out.println("a mobilePhone can do something");
    }

    public void call(String number) {
        System.out.println("mobile phone is used to make a call");
    }

    

}

class Manushya {

    public Manushya() {
        System.out.println(" no arg constr in Manushya ");
    }

    public void use(Device d) {

        if (d instanceof MobilePhone) {
            MobilePhone m = (MobilePhone) d;
            m.doSomething();
        }

    }
}

class TestDevice {

    public static void main(String[] args) {

        Device.eat();
        MobilePhone m = new MobilePhone();
        m.doSomething();

        Device d = new MobilePhone();
        Manushya ms = new Manushya();
        ms.use(d);

    }
}