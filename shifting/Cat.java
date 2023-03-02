package shifting;

import java.util.Arrays;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Cat [] cats = new Cat[4];
        cats[0] = new Cat("1");
        cats[1] = new Cat("2");
        cats[2] = new Cat("3");
        cats[3] = new Cat("4");

        cats [1] = null;

        System.out.println(Arrays.toString(cats));

        for (int i = 2; i < cats.length; i++) {
            cats[i-1] = cats [i];
            cats [i] = null;
        }

        System.out.println(Arrays.toString(cats));
    }
}
