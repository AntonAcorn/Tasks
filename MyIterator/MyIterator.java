package MyIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//как удалить элемент из списка с помощью итератора
//how to remove an element from a list using an iterator
public class MyIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(6);
        list.add(7);
        list.add(3);
        list.add(1);

        Iterator <Integer> iterator = list.iterator();
        int index = 0;
        while(iterator.hasNext()){
            iterator.next();
            if (index == 4)
                iterator.remove();
            index ++;
        }
        System.out.println(list);

    }
}

