package builtinfunctionalinterfaces;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Predicate<String> startsWithLetterV = x->x.toLowerCase().charAt(0)=='v';
        Predicate<String> endsWithLetterL = x->x.toLowerCase().charAt(x.length()-1)=='l';

        Predicate<String> condition = startsWithLetterV.and(endsWithLetterL);
        System.out.println(condition.test("vipul"));
        System.out.println(startsWithLetterV.negate().test("vipul"));

        //others are function, consumer, supplier

        Function<String, String> function1 = str -> str.toLowerCase();
        //If u have same datatype of input and return in function then you can use below as well
        UnaryOperator<String> function2 = str -> str.toLowerCase();

        BiFunction<String, String, String> bifunction1 = (str1, str2)-> str1 + str2;
        //If u have same datatype of input and return in function then you can use below as well
        BinaryOperator<String> bifunction2 =  (str1, str2)-> str1 + str2;
    }

}
