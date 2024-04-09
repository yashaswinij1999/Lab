# State and Behavior

---

The Main Objective of this Excercise is to Understand State and Behaviour of an Object is directly propositional to one another.

## Practice Problems

1. [Create a Dog class. A Dog has a age (int) & name (String). Dogs can bark. If the age of the dog](#)
   [is less than 7, then it barks as many times as its age. If the age is =>7, then it will meow that many](#)
   [times. Implement the Dog class and test it in a Tester class.](#)

**Dog Class**

- The Dog class represents a dog with attributes such as age and name. Dogs have the ability to bark or meow based on their age.

**Attritubes**

- `age` (int) : represents the age of the dog.
- `name` (String) : represents the name of the dog.

**Behaviour**

- `bark` - Makes dog bark, based on its age. If age is less than 7 the dog barks, if the age is greater than 7, it meows.

**Example**

```
public class Dog {
    // Instance variables
    private int age;
    private String name;

    // Method to make the dog bark or meow
    public void bark() {
        if (age < 7) {
            for (int i = 0; i < age; i++) {
                System.out.println(name + " is barking!");
            }
        } else {
            for (int i = 0; i < age; i++) {
                System.out.println(name + " is meowing!");
            }
        }
    }
}
```

**Testing**

```
class Test {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.bark(8);
        System.out.println(d.age);

    }

}


```
