package functionalinterface;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //creating class for implementing interface
        MyInterface myInterface1 = new MyInterfaceImpl();
        myInterface1.sayHello();

        //creating anonymous class to implement interface
        MyInterface myInterface2 = new MyInterface() {
            ;

            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class!");
            }
        };

        myInterface2.sayHello();

        //using lambda expression to implement interface
        MyInterface myInterface3 = () -> System.out.println("Hello from lambda expression!");
        myInterface3.sayHello();

        AdditionInterface additionInterface = (a, b) -> a + b;
        System.out.println("Result of addition: " + additionInterface.add(5, 10));

        //implementing runnable interface using lambda
        Runnable runnable = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.setName("CounterThread");
        thread.start();


        Runnable tableOf2 = () -> {

            for (int i = 1; i <= 10; i++) {
                System.out.println(i * 2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread tableThread = new Thread(tableOf2);
        tableThread.setName("TableOf2Thread");
        tableThread.start();
    }
}