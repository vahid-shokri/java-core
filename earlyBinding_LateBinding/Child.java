package earlyBinding_LateBinding;

public class Child extends Parent {

    public static void staticMethod(){
        System.out.println("staticMethod in child");
    }

    @Override
    public void instanceMethod() {
        System.out.println("instanceMethod in child");
    }
}
