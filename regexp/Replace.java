package regexp;

public class Replace {
    public static void main(String[] args) {
        String a = "Hello hey there";
        System.out.println(a.replace(" ", "!"));  //Заменяем пробел на !. Replace принимает строку

        System.out.println(a.replaceAll("[eo]", "A")); //replaceAll принимает на вход регулярное выражение

        System.out.println(a.replaceFirst(" ", "!")); //Заменяет первое выражение
    }
}
