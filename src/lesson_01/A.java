package lesson_01;

import lesson_01.my_package.C;

public class A {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        c.printHello();
        b.printWorld();

        System.out.println("Мой новая ветка");
    }
}
