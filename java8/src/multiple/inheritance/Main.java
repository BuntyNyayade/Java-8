package multiple.inheritance;

public class Main implements A , B{

    public static void main(String[] args) {
        Main m = new Main();
        m.display();
    }

    @Override
    public void display() {
        A.super.display();
    }
}
