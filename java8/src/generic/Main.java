package generic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //without generic not type safe
        List list = new ArrayList();
        list.add("swapnil");
        list.add(123);

        System.out.println(list);

        //Here Box is not type safe
        Box stringBox = new Box("this is box");
        stringBox.container = 123;
        System.out.println(  stringBox.getContainer());

        GenericBox<String> genericBox = new GenericBox<>("this is generic box");
        //genericBox.container = 123;                                //here it will give compile time error
        System.out.println(genericBox.getContainer());
        System.out.println(genericBox.container.getClass().getName());
        System.out.println(genericBox.checkType());

        GenericBox<Integer> genericBoxInt = new GenericBox<>(123);
        //genericBox.container = "hi team";                                //here it will give compile time error
        System.out.println(genericBoxInt.getContainer());
        System.out.println(genericBoxInt.container.getClass().getName());
        System.out.println(genericBoxInt.checkType());




    }
}
