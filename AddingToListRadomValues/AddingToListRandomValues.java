package AddingToListRadomValues;

import java.util.ArrayList;
import java.util.List;

public class AddingToListRandomValues {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            int random = (int) (Math.random() *100); // [0;100)
            list.add(random);
        }
        System.out.println(list);

    }
}
