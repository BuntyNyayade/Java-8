package multiple.inheritance;

public interface B {

    default void display() {
        System.out.println("interface B");
    }
}
