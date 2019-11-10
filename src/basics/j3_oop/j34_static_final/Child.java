package basics.j3_oop.j34_static_final;

public class Child extends Parent {
//    @Override
    public static void m() {
        System.out.println("Child");
    }

//    @Override
    public final void m(int a) {
        System.out.println("Child");
    }
}
