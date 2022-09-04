package Enum;

public class Test {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        System.out.println(season.name()); // выводит имя константы без конструктора.
        // prints the name of a constant without a constructor
        Animal animal = Animal.CAT;
        System.out.println(animal.name());

        Animal frog = Animal.valueOf("FROG"); //используется, когда мы хотим из строки получить enum.
        // т.е. имя переменной будтл строка
        //is used when we want to get an enum from a string
        System.out.println(frog.getTranslation());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal()); ///Возвращает индекс enum; Returns enum index

    }
}
