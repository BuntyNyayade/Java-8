package methodreference;

public class Main {

    public static void main(String[] args) {

        //static method reference
        Runnable runnable = Sample::sample1;
        runnable.run();

        //static method with argument reference
        SampleInter inter = Sample::disp;
        inter.display("Swap");

        //instance method reference
        Sample sample = new Sample();
        Runnable run =  sample::printNo;
        Thread thread = new Thread(run);
        thread.start();

        UserInter us = User::new;
        User user = us.getUser();
        user.display();
    }

}
