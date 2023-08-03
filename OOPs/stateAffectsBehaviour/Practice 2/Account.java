public class Account {

    double bal;

    public void withdraw(int amt) {

        if (amt > 0) {

            bal = bal - amt;
            System.out.println("the bal after withdrawing = " + bal);

        }

    }

    public void deposit(int amt) {

        if (amt > 0) {

            bal = bal + amt;
            System.out.println("the bal after depositing = " + bal);

        }

    }

}

class TestAccount {

    public static void main(String[] args) {

        Account ac = new Account();
        ac.bal = 1000;
        ac.withdraw(100);
        ac.deposit(2000);

    }
}
