package week11.day2;

class A {
    public A(){
        System.out.print("A ");
    }
}

class B extends A {
    public B(){
        System.out.print("B ");
    }
}

class C extends B {
    public C(){
        System.out.print("C ");
    }
}

public class Q_27 {
    public static void main(String[] args) {

        C c = new C();

    }
}
