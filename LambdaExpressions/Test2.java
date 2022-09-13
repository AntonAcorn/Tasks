package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();
        int[] arr4 = new int[10];
        List<Integer> list4 = new ArrayList<>();
        int[] arr5 = new int[10];
        fillArr(arr);
        fillList(list);
        fillArr(arr2);
        fillList(list2);
        fillArr(arr3);
        fillList(list3);
        fillArr(arr4);
        fillList(list4);
        fillArr(arr5);

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < 10; i++) {              //изменения массива и листа старым способом
//            arr[i] = arr[i] * 2;
//            list.set(i, list.get(i)*2);
//        }





                 //************* map заменяет каждый элемент массива*************

        arr = Arrays.stream(arr).map(a -> a * 2).toArray();
        //map берет каждый элемент из набора данных и сопоставляет ему новый элемент
        //но здесь обязательно нужно превратить массив в поток!
        //т.е. есть лямбда итерируется по массиву и заменяет на новые эдементы
        //[1, 2, 3] -> [2, 4, 6]
        list = list.stream().map(a -> a * 2).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(Arrays.toString(arr));

              //************* filter изменяет массив по заданному условию*************

        arr2 = Arrays.stream(arr2).filter(a -> (a % 2 == 0)).toArray();                 //поток нужно превратить обратно в массив
        list2 = list2.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());    //лист превращаем в потом, поток возвращаем в лист
                                                                                        //collect(Collectors.toList()); просто запомнить
        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);


        //************* foreach изменяет массив по заданному условию*************

        Arrays.stream(arr3).forEach(a -> System.out.println(a)); //аналогично foreach
        Arrays.stream(arr3).forEach(System.out::println);
        list3.stream().forEach(a -> System.out.println(a));

        //************* reduce *************
        int sum1 = Arrays.stream(arr4).reduce((acc, b) -> acc+b).getAsInt();//getasint преобразует поток в конкретное целое число
        int sum2 = list4.stream().reduce((acc, b) -> acc * b).get();
        //аккумулятор - временная переменная-счетчик = первому значению
        // b - текущий элемент

        //[1, 2, 3] = 1(acc)+2(b) -> acc = 3
        //3 + 3 = acc =  6  это значение возвращается
        //если начальное значаение acc не устанавливается, то итерация начинается со 2 элемента
        System.out.println(sum1); // сумма всех элементов
        System.out.println(sum2); // произведение всех элементов

        arr5 = Arrays.stream(arr5).filter(a -> a % 2 != 0).map(a -> a *2).toArray();
        //Отфильтровали нечетные и умножили на два
        System.out.println(Arrays.toString(arr5));

    }



    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }

}
