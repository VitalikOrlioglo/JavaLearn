package basics.j3_oop.j34_static_final;

public class Parent {
    public static void m() {
        System.out.println("Parent static");
    }

    private final void m(int a) {
        System.out.println("Parent final");
    }
}
