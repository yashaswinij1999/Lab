# Object Oriented Programming

---

The main objective is of this excercise is to create object, assign state and invoke behaviours.

## Practice Problems.

1.[There are Cows. A Cow has a name and can moo. When you ask a](#)
[Cow to moo, it shouts out its name. Design a class for Cow and the ](#)
[tester code. After testing if cows work correctly, create 2 references and ](#)
[then point to same object. Verify what happens if you change the state ](#)
[of the object using one ref when you invoke behaviour using the second.](#)

## Cow Class

The Cow class represents the cow, having attributes of name and have ability to moo its name.

**Attributes**
name (String): represents the name.

**Behaviour**
moo : the cow has a moo functionality, when invoked it will prints its name.

Example:

```
public class Cow {

    String name;

    public void moo() {
        System.out.println("Cow mooing its name " + name);
    }

}

```

**Test Cow**
In the tester class, we will create the cow object, assign state and invoke behaviour.

```
class TestCow {

    public static void main(String[] args) {

        Cow c1 = new Cow();
        c1.name = "Raani";
        c1.moo();

        Cow c2 = new Cow();
        c2.name = "lakshmi";
        c2.moo();

        c1 = c2;
        c1.name = "gowri";
        c2.moo();

    }

}

```

In the above example, we have created the two instances of cow objects assigned the state and invoked the behaviour.
