package org.example.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pruebas_Streams {
    public static void main(String[] args) {
        Stream<Integer> str = Stream.of(1,2,3,4,5,6,7,8,9);
        List<Integer> lst = new ArrayList<>(Arrays.asList(1,3,5,7,9,11));

        long filtrados = lst.stream()
                .filter(nums -> nums >= 9)
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(filtrados);

        List<String> pueblos = new ArrayList<>(Arrays.asList("Elche","San Vicente","Mutxamel","Eliana"));
        pueblos.stream()
                .map(String::toUpperCase)
                .sorted()
                .toList()
                .forEach(System.out::println);
    }
}
