public class ATM {

    Card c;
    double amt;

    public void withDraw(Card c, double amt) throws MoneyIsOutOfBalException {

        if (c == null || amt <= 0) {
            throw new IllegalArgumentException("Invalid inputs");

        }
        if (amt > c.getBal()) {
            throw new MoneyIsOutOfBalException("Wrong business validation");

        }
        c.setBal(c.getBal() - amt);
        System.out.println(c.getBal());
    }

}

class MoneyIsOutOfBalException extends Exception {

    public MoneyIsOutOfBalException() {

    }

    public MoneyIsOutOfBalException(String data) {

    }
}

class TestAtm {

    public static void main(String[] args) {

        try {
            ATM a = new ATM();
            Card c = new Card();
            c.setAccNum("1548");
            c.setBal(1000);
            a.withDraw(c,500);
            
        } catch (Throwable t) {
            t.printStackTrace();
        }

    }
}