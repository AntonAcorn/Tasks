package Polymorphism;

public class BreakDancer extends Dancer {

    public BreakDancer(String name, int age) {
        super(name, age);
    }

    public void dance(){
        System.out.println(toString() + " Я танцую брейкданс");
    }
}
