package Polymorphism.andInteface;

public class Human implements Swim {
    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(toString() + "Я человек и умею плавать");
    }

    @Override
    public String toString() {
        return "Я " + name + ". Мне " + age + " Лет.";
    }
}
