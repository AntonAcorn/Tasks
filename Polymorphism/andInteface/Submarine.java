package Polymorphism.andInteface;

public class Submarine implements Swim {
    private int deep;
    private int speed;

    public Submarine(int deep, int speed) {
        this.deep = deep;
        this.speed = speed;
    }

    @Override
    public void swim() {
        System.out.println(toString() + " У меня есть двигатель");
    }

    @Override
    public String toString() {
        return "Я на глубине " + deep +
                ", плыву со скоростью " + speed;
    }
}
