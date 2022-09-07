package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparatorr {
    public static void main(String[] args) {


        List<String> animals = new ArrayList<>();

        animals.add("a");
        animals.add("Dog");
        animals.add("bb");
        animals.add("Frog");
        animals.add("Bird");
        animals.add("ccc");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);


        //Реализация интерфейса Comparator через анонимный класс
        //Implementing the Comparator interface through an anonymous class
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);

        Collections.sort(numbers, new Comparator<Integer>() {
            //Реализация интерфейса Comparator через анонимный класс, обратная сортировка
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                }else return 0;
            }
        });
        System.out.println(numbers);
    }
}

class StringLengthComparator implements Comparator<String> {
    /* По конвенции возвращает 1, 0 или -1
    если o1 > o2 -> return 1
    если o1 = o2 -> return 0
    если o1 < o1 -> return -1
     */
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()){return 1;
        } else if(o1.length()<o2.length()){return -1;
        } else return 0;
    }
}





