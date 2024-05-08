
public class ATM {

    private String accNum;
    private double bal;

    public void setAccNum(String accNum) {

        if (accNum.length() > 15) {
            throw new IllegalArgumentException("the account number length is more than 15");
        } else if (accNum == null || accNum.equals("")) {
            throw new IllegalArgumentException("invalid account number");
        }
        this.accNum = accNum;

    }

    public String getAccNum() {
        return accNum;

    }

    public void setBal(double bal) throws InvalidBankBalanceException {
        if (bal < 0) {
            throw new InvalidBankBalanceException("bal should be morethan zero");
        } else {
            this.bal = bal;
        }

    }

    public double getBal() {
        return bal;
    }

    public void withDraw(double amt) {

    }

}

class TestATM {

    public static void main(String[] args) {

        try {
            
            ATM a = new ATM();
            a.setAccNum("KARB000012");
            System.out.println(a.getAccNum());

            a.setBal(1000);
            System.out.println(a.getBal());

        } catch (InvalidBankBalanceException e) {
            // TODO: handle exception
            e.printStackTrace();

            System.out.println(e.getMessage());
        }

    }

}

class InvalidBankBalanceException extends Exception {

    public InvalidBankBalanceException() {
        super();
    }

    public InvalidBankBalanceException(String msg) {
        super(msg);
        System.out.println("paramterised constructor");
    }

}
