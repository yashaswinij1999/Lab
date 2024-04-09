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

**Tester**

The Tester class can be used to create instances of the Dog class and test its functionality.

```
class Test {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.bark(8);
        System.out.println(d.age);

    }

}


```

In the above example, A new Dog Object is created, and invoking the bark behaviour.

2. [Create an Account class. An Account has a balance (double), accNum (String). Implement](#)
   [functionalities for withDraw(), deposit() and checkBalance() in Account class. Pay attention to what](#)
   [will be the argument list and return data types for each method. Understand how state affects](#)
   [behaviour and vice-versa here](#)

**Account Class**

- The Account class represents a Account with Balance and Account Number has its attributes. The Account has ability to deposit and withdraw the money.

**Attributes**

- balance (double) : It represents the balance in account.
- accountNumber (String) : It represents the accountNumber of the Account.

**Behaviour**

- Deposit : If the deposited amount is greater than `zero', adds the amount to the Total Balance.
- Withdraw : To withdraw from Account, the amount should be greater than zero and the account balance should be greater than amount.
- CheckBalance : It returns the total balance of that particular account.

```
<!-- Account Class -->
public class Account {

    <!-- Instance variables -->
    double bal;
    String accNum;

    <!-- deposit behaviour -->
    public void deposit(double amt) {

        if (amt > 0) {

            bal = bal + amt;
            System.out.println("Amount deposited sucessfully");

        } else {
            System.out.println("Amount is lesser than zero");
        }

    }

    <!-- withdraw behaviour -->
    public void withDraw(double amount) {

        if (amount > 0) {

            if (bal > amount) {

                bal = bal - amount;
                System.out.println("The amount withdrawn from account successfully");

            } else {
                System.out.println("balance is lesser than amount");

            }

        } else {

            System.out.println("Amount is lesser than zero");

        }

    }

    public double checkBalance() {
        return bal;
    }

}

```

**Tester Class**

Tester class used to test the instances of Account Object and test its functionality.

```

class TestAccount {

    public static void main(String[] args) {

        Account acc = new Account(1000);
        acc.deposit(100);
        acc.withDraw(50);
        System.out.println(acc.checkBalance());

    }

}

```

In this example, Account object is created with balance of `1000` and invoked the deposit and withdraw functionality.

3.[Create a Person class. A Person has a name and age. A Person can dance. When you ask a](#)
[Person to dance, if his age < 30, he will do barathnatya and if his age is >=30 then he will do snake](#)
[dance](#)

**Person Class**
The Person class represents the person object with name and age has its attributes.The Person has ability to dance based on the its age.

**Attributes**

- name (String) : represents the name of the person.
- age (int) : represents the age of the person.

**Behaviour**

- dance : Makes the person to dance, based on its age, if age is lesser than 30, the person dances bharathanatya, if the age is greater than 30, he does snake dance.

```
public class Person {

    String name;
    int age;

    public void dance(int age) {

        if (age > 0) {

            if (age < 30) {
                System.out.println("The person does Bharatanatya");
            } else {
                System.out.println("The person does snake dance");
            }

        }

    }

}

```

TestPerson Class

The TestPerson class creates the Person object, and invokes its behaviour to test the functionality.

```
class TestPerson {

    public static void main(String[] args) {

        Person p = new Person();
        p.dance(30);
    }

}
```

In the above example, Person object is created and dance functionality is invoked.
