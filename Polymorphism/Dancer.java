package Polymorphism;

public abstract class  Dancer{
    private String name;
    private int age;

    public Dancer(String name, int age) {
        this.name = name;
        this.age = age;
    }




    @Override
    public String toString() {
        return "My name is " + name + ". I am " + age + " years old.";
    }
    public void dance(){
        System.out.println(toString() + " Я танцую как могу");
    }
}
