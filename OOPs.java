
class A {
    public int var1, var2;

    A(int a, int b) {
        this.var1 = a;
        this.var2 = b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public void display() {
        System.out.println("Class-A is displaying");
    }
}

class B extends A {
    public float var3, var4;

    B(int a, int b, float c, float d) {
        super(a, b);
        this.var3 = c;
        this.var4 = d;
    }

    public int add() {
        int a = 100;
        int b = 200;
        return a + b;
    }

    @Override
    public void display() {

        System.out.println("Class-B is displaying");
    }
}

public class OOPs {
    public static void main(String args[]) {
        B objB = new B(10, 20, 3.14f, 10.08f);

        System.out.println(objB.add(objB.var1, objB.var2));
        System.out.println(objB.add());
    }
}