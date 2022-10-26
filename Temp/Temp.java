package Temp;


import java.util.*;

//Convert number to reversed array of digits
public class Temp {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] array2 = {3, 2, 3, 5};
        //System.out.println(Arrays.toString(arrayDiff(array, array2)));
        //System.out.println(Arrays.toString(arrayDiff(array, array2)));
        String a = "";
        a = a + "Hello! ";
        a = a +  "Hello2!";
        System.out.println(a);

    }


    public static String whoLikesIt(String... names) {
        //Do your magic here
        final int count = names.length;
        switch (count){
            case 0 : return "no one likes this";
            case 1 : return String.format("%s likes this", names[0]);
            case 2 : return String.format("%s and %s like this", names[0],names[1]);
            case 3 : return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default: return String.format("%s, %s and %d like this", names[0], names[1], count-2);
        }
    }
}
