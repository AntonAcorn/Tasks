package regexp;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String a = "Hello.there.hey";
        String [] words = a.split("\\.");           //вырезаем точи. \\это экранирование
        System.out.println(Arrays.toString(words));

        String b = "Hello1hey2there3hi";
        String [] wordsNumbers = b.split("\\d");    //вырезаем цифры. \\это экранирование
        System.out.println(Arrays.toString(wordsNumbers));

    }
}
