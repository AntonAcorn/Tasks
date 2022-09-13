package LambdaExpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Goodbye");
        list.add("a");
        list.add("bb");

        list.sort(new Comparator<String>() {            //Анонимный класс
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        list.sort((s1, s2) -> {                        //через лямбду (() -> {});
            if (s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() < s2.length()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(list);
    }
}
