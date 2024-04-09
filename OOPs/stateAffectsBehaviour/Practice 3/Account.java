
public class Account {

    double bal;
    String accNum;

    public Account(int bal) {
        this.bal = bal;
    }

    public void deposit(double amt) {

        if (amt > 0) {

            bal = bal + amt;
            System.out.println("Amount deposited sucessfully");

        } else {
            System.out.println("Amount is lesser than zero");
        }

    }

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

class TestAccount {

    public static void main(String[] args) {

        Account acc = new Account(1000);
        acc.deposit(100);
        acc.withDraw(50);
        System.out.println(acc.checkBalance());

    }

}
