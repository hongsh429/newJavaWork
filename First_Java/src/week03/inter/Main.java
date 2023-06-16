package week03.inter;

public class Main {
    public static void main(String[] args) {

        A a1 = new B();
        A a2 = new C();

        a1.a();
        ((B) a1).b();

        a2.a();
        ((C) a2).b();
        ((C) a2).c();


    }
}

interface A {
    void a();
}

class B implements A {
    @Override
    public void a() {
        System.out.println("B.a()");
    }

    public void b() {
        System.out.println("B.b()");
    }
}

class C extends B {
    public void c() {
        System.out.println("C.c()");
    }
}
