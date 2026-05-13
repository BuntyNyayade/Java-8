package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 6, 4);
        List<Integer> list = Arrays.asList(2, 6, 4, 7, 9, 10, 13, 16);

        Stream<Integer> stream = list.stream();
        List<Integer> collect = stream.filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(collect);

        numbers.stream().forEach(s-> System.out.println(s));
        collect.forEach(System.out::println);

        //1-blank
        Stream<Object> empty = Stream.empty();
        empty.forEach(System.out::println);                          // No data

        //2-array,object,collection
        String[] names = new String[]{"swapnil", "ajit", "ramesh"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(System.out::println);

        //3
        Stream<Object> build = Stream.builder().build();

        //4
        IntStream stream2 = Arrays.stream(new int[]{1, 2, 3});
        stream2.forEach(System.out::println);

        list.stream().sorted().forEach(System.out::println);
        Integer i = list.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(i);

    }

}
