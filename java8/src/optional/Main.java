package optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        String name = "swapnil";
        Optional<String> name1 = Optional.ofNullable(name);
        name1.ifPresent(System.out::println);
        System.out.println(name1.orElse("Name is null"));
    }
}
