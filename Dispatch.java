class A {

    void callme() {
        System.out.println("KEVIN A DOBBIN MCA 'A' SEC\n");
        System.out.println("Inside A callme method");
    }
}

class B extends A {

    void callme() {
        System.out.println("Inside B callme method");
    }
}

class C extends A {

    void callme() {
        System.out.println("Inside C callme method");
    }
}

public class Dispatch {

    public static void main(String[] args) {

        A d;          // reference of superclass

        d = new A();  // object of A
        d.callme();

        d = new B();  // object of B
        d.callme();

        d = new C();  // object of C
        d.callme();
    }
}
