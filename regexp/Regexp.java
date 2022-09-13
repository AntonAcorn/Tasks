package regexp;

public class Regexp {
    public static void main(String[] args) {
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

        String a = "-354543543543";
        String b = "2343242312331";
        String c = "+123123213123";

        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "sdfsdfdsfds";
        System.out.println(d.matches("[a-zA-Z]*\\d*"));

        String e = "123asdfsdfsd123dsfsdf123";
        System.out.println(e.matches("[a-zA-Z123]*"));

        String url1 = "https//:www.google.com";
        String url2 = "https//:www.yandex.ru";
        System.out.println(url1.matches("https//:www\\..*\\.(com|ru)"));
        System.out.println(url2.matches("https//:www\\..*\\.(com|ru)"));

        String f = "123";
        System.out.println(f.matches("\\d{3}")); //ищем 3 цифры
    }
}
