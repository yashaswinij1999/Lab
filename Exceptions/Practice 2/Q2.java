public class Q2 {

    public static void main(String[] args) {

        Person p = new Person();
        p.age = 20;
        p.size = 30;
        // System.out.println(p.age);

        Person p1 = new Dog();
        // Cat c = (Cat) p1;
        // System.out.println(c.size);

        // int x = Integer.parseInt("one");
        // System.out.println(x);

        // while (1 == 1) {

        // Q2.main(args);

        // }

        // int[] arr = new int[Integer.MAX_VALUE];

    }

}

class Person {

    int age;
    int size;

}

class Dog extends Person {

}

class Cat extends Person {

}