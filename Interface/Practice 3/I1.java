
public interface I1 {

    public void inM1();

}

interface I2 {

    public int inM2();

    public void m2();

}

/* a class not have method with same names, inorder to implement method m1() from both I1 and I2, the method names as to be different */

class C1 implements I1, I2 {

    @Override
    public void inM1() {
        System.out.println("in m1");
    }

    @Override
    public int inM2() {
        System.out.println("in m1");
        return 1;
    }

    public void m2() {

    }

}

abstract class A1 implements I2 {

    @Override

    public int inM2() {
        return 1;
    }

}

class C2 extends A1 {

    @Override
    public void m2() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
