package comparatorMap;

import maps.Maps;

import java.util.*;

public class comparatorMap {
    public static void main(String[] args) {
        Map <String, Integer> map = new HashMap<>();
        map.put("a", 5);
        map.put("c", 3);
        map.put("b", 4);
        map.put("e", 1);
        map.put("d", 2);
//        sortByValue(map);
       map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }

//    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
//        Map<String, Integer> temp = new TreeMap<>(new myComparator(map));
//        temp.putAll(map);
//        System.out.println(temp);
//        return temp;
//    }
//
//
//}
//class myComparator implements Comparator<String> {
//    Map <String, Integer> map;
//
//    public myComparator(Map<String, Integer> map) {
//        this.map = map;
//    }
//
//    @Override
//    public int compare(String o1, String o2) {
//        return map.get(o1) - map.get(o2);
//    }
}

