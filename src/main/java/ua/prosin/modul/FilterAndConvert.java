package ua.prosin.modul;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAndConvert {
    public static List<String> filterAndConvert(List<Integer> list){
        return list.stream().filter(x -> x > 100)
                .map(Object::toString)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 45, 67, 99, 100, 101, 145, 298, 300);

        List<String> filterAndConvert = FilterAndConvert.filterAndConvert(list);
        for (String item : filterAndConvert) {
            System.out.println(item);
        }
    }
}
