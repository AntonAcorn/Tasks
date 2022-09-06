package Maps;

import java.util.*;

public class Maps {
    public static void main(String[] args) {

        /*HashMap, TreeMap, LinkedMap
        Hash map используется когда не важен порядок вывода
        TreeMap  сортирует по ключу
        LinkedMap выводит в порядке добавления

         */

        Map<Integer, String> Hashmap = new HashMap<>();

        Map<Integer, String> treeMap = new TreeMap<>();

        Map <Integer, String> linkedMap = new LinkedHashMap<>();

        print(Hashmap);
        System.out.println();
        print(treeMap);
        System.out.println();
        print(linkedMap);
        }
        public static void print (Map <Integer, String> map){
            map.put(1, "Vasa");
            map.put(2, "Sliva");
            map.put(56, "Dibi");
            map.put(89, "Dobby");
            map.put(4, "Karl5");
            for (Map.Entry <Integer, String> entry: map.entrySet()
                 ) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

    }
}
