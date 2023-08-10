public class Account {

    private double balance;

    public Account() {

    }

    public Account(double balance) {

        this.balance = balance;

    }

    public void setBal(double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException("invalid bal amount");
        }
        this.balance = balance;

    }

    public double getBalance() {

        return balance;

    }

    public void withDraw(double amt) {

        if (amt > 0 && amt < balance) {

            balance = balance - amt;
            System.out.println(" bal after withDrawing the amount " + getBalance());

        }

    }

    public void deposit(double amt) {

        if (amt > 0) {

            balance = balance + amt;
            System.out.println(" the balance after withdrawing the amt " + getBalance());

        }

    }

}

class BankAccount extends Account {

    double MinBalance;
    double MaxBalance;
    double balance;

    public BankAccount() {

    }

    public BankAccount(double MinBalance, double MaxBalance, double balance) {

        this.MaxBalance = MaxBalance;
        this.MinBalance = MinBalance;

        if (balance < MinBalance || balance > MaxBalance) {

            throw new IllegalArgumentException("invalid balance");

        } else {

            this.balance = balance;

        }

    }

    public double getBalance() {

        return balance;

    }

    public void withDraw(double amt) {

        if (amt < 0) {
            System.out.println("the amt entered is equal or less than 0");
            return;
        }

        if (amt > balance) {
            System.out.println("the amt is greater than balance");
            return;
        }

        if (getBalance() - amt <= MinBalance) {
            System.out.println("the amt after deducting is less than min balance ");
            return;

        } else {

            balance = getBalance() - amt;
            System.out.println("the amt after withdrawing = " + getBalance());

        }

    }

    public void deposit(double amt) {

        if (amt < 0) {
            System.out.println("the amount entered is less than or equql to Zero");
            return;
        }

        if (amt > MaxBalance) {
            System.out.println("the amt is greater than max balance");
            return;
        }

        if (getBalance() + amt >= MaxBalance) {
            System.out.println("the amt enetered is greater than max balance");
            return;
        }

        balance = getBalance() + amt;
        System.out.println("the balanace after depositing is equal to " + getBalance());

    }

}

class CreditCardAccount extends Account {

    double MinBalance;
    double MaxBalance;
    double balance;

    public CreditCardAccount() {

    }

    public CreditCardAccount(double MinBalance, double MaxBalance, double balance) {

        this.MaxBalance = MaxBalance;
        this.MinBalance = MinBalance;

        if (balance < MinBalance || balance > MaxBalance) {

            throw new IllegalArgumentException("invalid balance");

        } else {

            this.balance = balance;

        }

    }

    public double getBalance() {

        return balance;

    }

    public void withDraw(double amt) {

        if (amt < 0) {
            System.out.println("the amt entered is equal or less than 0");
            return;
        }

        if (getBalance() - amt <= 100) {
            System.out.println("the amt after deducting is less than min balance ");
            return;

        }

        balance = getBalance() - amt;
        System.out.println("the amt after withdrawing = " + getBalance());

    }

    public void deposit(double amt) {

        if (amt < 0) {
            System.out.println("the amount entered is less than or equql to Zero");
            return;
        }

        if (amt > MaxBalance) {
            System.out.println("the amt is greater than max balance");
            return;
        }

        if (getBalance() + amt >= MaxBalance) {
            System.out.println("the amt enetered is greater than max balance");
            return;
        }

        balance = getBalance() + amt;
        System.out.println("the balanace after depositing is equal to " + getBalance());

    }

}

class Human {

    Account acc;
    String name;

    public Human() {

    }

    public Human(Account acc) {

        this.acc = acc;

    }

    public void buy(String name, double amt) {

        if (acc.getBalance() < amt) {

            System.out.println("the bal is less than amt");
            return;

        } else {

            acc.withDraw(amt);

        }

    }

    public void debit(double amt) {

        acc.deposit(amt);

    }

}

class TestAccount {

    public static void main(String[] args) {

        // Account acc = new Account();
        // acc.setBal(20000);
        // System.out.println(acc.getBalance());
        // acc.withDraw(200001);
        // System.out.println(acc.getBalance());
        // acc.deposit(12000);

        BankAccount b = new BankAccount(100.00, 100000.00, 50000.00);
        System.out.println(b.getBalance());
        // b.withDraw(500001);
        // b.deposit(40000);

        CreditCardAccount c = new CreditCardAccount(-100, 10000, 5000);
        // c.withDraw(500);
        // c.deposit(1200);

        Human h = new Human(c);
        h.buy("Pen", 50);
        h.debit(50000);

    }
}