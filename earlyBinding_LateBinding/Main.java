package earlyBinding_LateBinding;

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.instanceMethod();
        p.staticMethod();
    }
}
