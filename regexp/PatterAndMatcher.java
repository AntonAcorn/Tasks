package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
        regExLib.com
        \\d - 1 цифра
        \\w - 1 буква = [a-zA-Z]
        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символов до

        (x|y|z) - одна строка из множества
        [xyz] - тоже самое что или (x|y|z)

        [a-zA-Z] - все английские буквы
        [0-9] - \\d
        [ˆabc] - хотим все символы, кроме abc
        . - любой символ

        {2} - 2 символа до              (\\d{2}) вместо этого ищем 2 цифры
        {2,} - 2 или более символов     (\\d{2, }) ищем два и более символа
        {2,4} - от 2 до 4               (\\d{2,4}) ищем от 2 до 4 символов
         */

public class PatterAndMatcher {
    public static void main(String[] args) {
        String text = "Hello guys! I send you my email joe@gmail.com. So we can\n"+
                "keep in touch. Thanks Joe! That's cool! I am sending you\n+" +
                "my address: tim@yandex.ru. Let's stay in touch";
        Pattern email = Pattern.compile("(\\w*)@(gmail|yandex)\\.(ru|com)");        // this is a way how to create pattern
                                                                                        // factory method, its constructor is private, that's why we use in this way
                                                                                        //we have static method
        Matcher matcher = email.matcher(text);
        while (matcher.find()){         //ищет совпадения
            System.out.println(matcher.group()); //метод group достает совпадение. Так называется, потому что в его
            //параметры мы можем положить индекс группы (группа - все что в скобках в регулярном выражении)
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
    }

}
