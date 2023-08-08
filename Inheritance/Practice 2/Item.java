public class Item {

    private String name;
    private int prize;

    public String toString() {

        return name;
    }

    public Item() {

        System.out.println("no arg constructor");

    }

    public Item(String name, int prize) {

        System.out.println("paramterised constructor");
        this.name = name;
        this.prize = prize;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setPrize(int prize) {

        this.prize = prize;

    }

    public int getPrize() {

        return prize;

    }

}

class Cap extends Item {

    public Cap() {

    }

    public Cap(String name, int prize) {

        super(name, prize);

    }

}

class Pen extends Item {

    public Pen() {

    }

    public Pen(String name, int prize) {

        super(name, prize);

    }

}

class LipStick extends Item {

    public LipStick() {

    }

    public LipStick(String name, int prize) {

        super(name, prize);

    }

}
