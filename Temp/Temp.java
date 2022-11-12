package Temp;


import java.util.*;
import java.util.stream.IntStream;

public class Temp {
    public static void main(String[] args) {
        int x[] = {-97, 899};
        String array[] = new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"};
        System.out.println(warnTheSheep(array));
    }

    public static String warnTheSheep(String[] array) {
        List<String> result = new ArrayList<>(Arrays.asList(array));
        Collections.reverse(result);

        int pos = result.indexOf("wolf");
        return pos == 0 ? "Pls go away and stop eating my sheep" :
                "Oi! Sheep number "+pos+"! You are about to be eaten by a wolf!";
    }

}