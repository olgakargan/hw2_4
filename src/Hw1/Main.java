package Hw1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main  {
    public static List<String> processTheList(List<String> nameList) {
        return nameList.stream()
                .map(x -> x.substring(1))
                .sorted().collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Роман");
        nameList.add("Илья");
        nameList.add("Анна");
        nameList.add("Ольга");
        nameList.add("Иван");
        nameList.add("Петр");
        nameList.add("Миша");

        System.out.println(processTheList(nameList));
    }

}