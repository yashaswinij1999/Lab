public class Account {

    private double bal;
    String accNum;

    public void setBal(double bal) {

        if (bal < 0 || bal > 20000) {

            throw new IllegalArgumentException("Invalid Bal input");

        }
        this.bal = bal;
    }

    public double getBal() {

        return bal;

    }

    public void withDraw(double amt) {

        if (amt > 0 && amt < bal) {

            bal = bal - amt;

        }

    }

    public void deposit(double amt) {

        if (amt > 0 && amt < bal) {

            bal = bal + amt;

        }

    }

}

class TestAccount {

    public static void main(String[] args) {

        Account a1 = new Account();
        a1.setBal(19000);
        a1.withDraw(-800);
        System.out.println("getBalance = " + a1.getBal());
        a1.deposit(5000);
        System.out.println("getBalance = " + a1.getBal());

    }
}