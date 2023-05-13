public class Account {

    double bal;

    public void setBal(double amt) {

        if (amt > 0) {
            this.bal = amt;
        } else {
            System.out.println("the amt is less than Zero");
        }
    }

    public double getBal() {
        return bal;
    }

    public Account() {

        System.out.println("no arguement constructor in the Account class");
    }

    public void withDraw(double amt) {

        if (amt > 0) {

            bal = bal - amt;
        }
        System.out.println("the amt has been withdrawn form account");
    }

    public void deposit(double amt) {

        if (amt > 0) {
            bal = bal + amt;
            System.out.println("the amt has deposited to the account");
        }
    }

}

class BankAccount extends Account {

    double maxBal;
    double minBal;
    private double bal;

    public void setBal(double bal) {

        if (bal < minBal || bal > maxBal) {
            throw new IllegalArgumentException("Invalid bal in BankAccount ");
        }
        this.bal = bal;
    }

    public double getBal() {
        return bal;
    }

    public BankAccount(double minBal, double maxBal) {
        this.maxBal = maxBal;
        this.minBal = minBal;
    }

    public void withDraw(double amt) {

        if (amt <= 0) {
            System.out.println("the amt is less than zero ");
            return;
        }
        if (amt > getBal()) {
            System.out.println("the amt is greater than bal ");
            return;
        }
        if (getBal() - amt <= minBal) {
            System.out.println("bal is less than minBal");
            return;
        }
        bal = getBal() - amt;
        System.out.println("bal after withdrawing the amt = " + getBal());

    }

    public void deposit(double amt) {

        if (amt <= 0) {
            System.out.println("unable to deposit the amt has amt is lesser than 0");
            return;
        }
        if (amt > maxBal) {
            System.out.println("the amt is greather than maxbal");
            return;
        }
        if (getBal() + amt >= maxBal) {
            System.out.println("the amt is excedding the maxbal");
            return;
        }
        bal = getBal() + amt;
        System.out.println("the bal after depositing  = " + getBal());
    }

}

class CreditCardAccount extends Account {

    private double bal;
    double minBal;
    double maxBal;

    public void setBal(double bal) {

        if (bal < minBal || bal > maxBal) {
            throw new IllegalArgumentException("Invalid bal in CreditCardAccount ");
        }
        this.bal = bal;
    }

    public double getBal() {
        return bal;
    }

    public CreditCardAccount(double minBal, double maxBal) {
        this.maxBal = maxBal;
        this.minBal = minBal;
    }

    public void withDraw(double amt) {

        if (amt <= minBal) {
            System.out.println("the amt is lesser than minbal in cca ");
            return;
        }

        if (getBal() - amt <= minBal) {
            System.out.println("the amt is lesser than min bal in cca ");
            return;

        }

        bal = getBal() - (amt);
        System.out.println("the amt drwan succesfully cca and bal = " + getBal());
    }

    public void deposit(double amt) {

        if (amt <= minBal) {
            System.out.println("unable to deposit the amt has amt is lesser than 0");
            return;
        }
        if (amt > maxBal) {
            System.out.println("the amt is greather than maxbal");
            return;
        }
        if (getBal() + amt >= maxBal) {
            System.out.println("the amt is excedding the maxbal");
            return;
        }
        bal = getBal() + amt;
        System.out.println("the bal after depositing  = " + getBal());
    }
}

class Human {

    Account acc;

    public Human() {

    }

    public Human(Account acc) {

        this.acc = acc;
        if (acc instanceof CreditCardAccount) {
            CreditCardAccount cca = (CreditCardAccount) acc;
            cca.setBal(3000);

        }

    }

    public void buyItem(String name, double price) {

        if (acc instanceof CreditCardAccount) {
            CreditCardAccount cca = (CreditCardAccount) acc;

            cca.withDraw(price);
            System.out.println("the person buys a item " + name + " bal = " + cca.getBal());

        }

    }

    public void debit(double amt) {
        if (acc instanceof CreditCardAccount) {
            CreditCardAccount cca = (CreditCardAccount) acc;
            cca.deposit(amt);
            System.out.println("person debits amt  = " + amt + " bal = " + cca.getBal());
        }
    }

}

class TestAccount {

    public static void main(String[] args) {

        Human h = new Human(new BankAccount(100, 10000));
        h.buyItem("Pen", 500);
        h.debit(1200);

        Human h2 = new Human(new CreditCardAccount(-500, 25000));
        h2.buyItem("Pen", 400);
        h2.debit(1200);

        CreditCardAccount cca = new CreditCardAccount(-500, 25000);
        cca.setBal(20000);
        System.out.println(" bal = " + cca.getBal());
        // cca.withDraw(200);
        cca.deposit(-400);

    }
}