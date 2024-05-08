
public class Q2 {

    public static void main(String[] args) {

        try {
            Person p = null;
            p.sleep();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        System.out.println("the main end");

    }

}

class Animal {

    public void sleep() {
        System.out.println("the person sleeps");
    }

}
class Cat extends Animal{

}
class Dog extends Animal{
    
}