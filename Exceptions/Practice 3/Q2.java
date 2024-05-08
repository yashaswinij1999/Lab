
public class Q2 {

    public static void main(String[] args) {

        try {

            /* 
            Person p = null;
            p.sleep();

            Animal a = new Dog();
            Cat c = (Cat) a;
            c.sleep();
            
            String s = args[0];
             System.out.println(Integer.parseInt(s));
            */
            
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

class Cat extends Animal {

}

class Dog extends Animal {

}
