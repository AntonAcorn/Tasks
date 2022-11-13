package mapCompute;

import java.util.*;
//iven a list and a number, create a new list that contains each number of list at most N times, without reordering.
//For example if the input number is 2, and the input list is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
//With list [20,37,20,21] and number 1, the result would be [20,37,21].

public class Task {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 3, 7, 2, 2, 2, 2};
        System.out.println(Arrays.toString(deleteNth(array, 3)));
    }
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(Integer element: elements){
            count.compute(element, (k,v) -> v == null? 1 : v + 1);
            if(count.get(element) <= maxOccurrences){
                list.add(element);
            }
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}

