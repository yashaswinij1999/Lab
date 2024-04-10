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

2.[ Check if instance variables of type string, int and boolean are given ](#)
[ default values. Check if local variables are given default values. ](#)
[ How to do this? Create a class with 4 instance variables with String](#)
[ boolean, int and boolean as datatypes. Create a Tester class with main](#)
[ where you create an object and using reference print the instance ](#)
[ variable values to monitor using SOP.](#)

## Q2 Class

Q2 class is created to check the default values of the instance variables.

Example

```

public class Q2 {

    String str;
    int i;
    boolean b;

}

```

## Tester Class

The Tester Class is creates new object and checks the default values of different datatypes.

```
class TestQ2 {

    public static void main(String[] args) {

        Q2 q = new Q2();
        System.out.println(q.str);
        System.out.println(q.i);
        System.out.println(q.b);

    }

}

```

3.[A Pen has inkQty (int), colour (string) and can be used to write and](#)
[refill. A text must be given for it to write. A quantity must be given to refill.](#)
[If there is ink then the pen will write the text given to it (SOP). Refill](#)
[works by taking in the int qty to add to the existing inkQty. First as a ](#)
[class designer, on paper apply OOAD and arrive at the class design.](#)
[Then create the class implementation and create a tester class to create](#)
[2 pen objects, give it inkQty and ask it to write. First code this on your ](#)
[own. If you cannot get it correctly, then see Pen.java and TestPen.java. ](#)
[Then fix the code and rerun. Do not see the code first](#)

## Pen Class

The pen class is represents pen object, with inkQty and color has its state. Pen have a ability to refill and write.

**Attributes**

- inkQty(int) - represents the inkqty.
- color (String) - represents the ink color.

**Behaviour**

- write(data) - If the inkQty is greater than zero, the pen writes the data.
- refill(inkQty) - The refill takes the inkQty and adds to the existing inkQty to the Pen.

Example

```
public class Pen {

    int inkQty;
    String color;

    public void write(String data) {

        if (inkQty > 0) {
            System.out.println("Pen can write a data : " + data + " with " + color + " color ");
        } else {
            System.out.println("The ink qty is less, add ink to it");
        }
        inkQty--;

    }

    public void refill(int inkqty) {

        if (inkqty > 0) {
            inkQty = inkQty + inkqty;
            System.out.println("The total inkQty : " + inkQty);
        } else {
            System.out.println("The ink qty provided is lesser than zero");
        }

    }

}

```

**TestPen**
The Testpen class is creates the pen object, assign state and invokes the behaviour.

```
class TestPen {

    public static void main(String[] args) {

        Pen p = new Pen();
        p.inkQty = 2;
        p.color = "black";
        p.write("rama");
        p.refill(2);
        p.write("rama");
        p.write("sita");
        p.write("hanuman");
        p.write("shiva");
        System.out.println(p.inkQty);

    }

}
```
