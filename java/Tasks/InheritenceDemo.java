
class Base {
    static int s;
    int a, b;
    static {
        System.out.println("base class loaddde.......");
        s = 120;
    }

    {
        System.out.println("instance block of base class is  loaded..");
    }

    Base() {
        a = 100;
        b = 200;
        System.out.println("base class constructor loadded....");
    }

    public void display() {
        System.out.println("elements of base class");
        System.out.println("a:" + a);
        System.out.println("b:" + b);

    }
}

class Child extends Base {
    static int s2;
    int c, d;
    static {
        System.out.println("child class loaded....");
        s2 = 10;
    }

    Child() {
        System.out.println("child class constructor loaded......");
        c = 300;
        d = 400;
    }

    {
        System.out.println("instance block of child class loaded");
    }

    void display2() {
        display();
        System.out.println("elements of child class");
        System.out.println("c:" + c);
        System.out.println("d:" + d);
    }
}

public class InheritenceDemo {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.display();
        System.out.println(Child.s);

    }
}
