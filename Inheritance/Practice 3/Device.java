
public class Device {

    String name;

    public void doSomething() {
        System.out.println(name + " A device can do something ");
    }

}

class TestDevice {

    public static void main(String[] args) {

        Device d = new Device();
        d.name = "Davy";
        d.doSomething();

    }

}
