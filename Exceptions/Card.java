public class Card {

    private String accNum;
    private double bal;

    public void setAccNum(String accNum) {
        if (accNum == null || accNum.equals("")) {
            throw new IllegalArgumentException("Invalid accNum");
        }
        this.accNum = accNum;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setBal(double bal) {

        if (bal < 0) {
            throw new IllegalArgumentException("Invalid bal in Account ");
        }
        this.bal = bal;
    }

    public double getBal() {
        return bal;
    }

}
