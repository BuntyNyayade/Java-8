package multiple.inheritance;

public interface A {
    default void display() {
        System.out.println("interface A");
    }
}
