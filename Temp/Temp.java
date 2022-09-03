package Temp;

import java.sql.SQLOutput;

public class Temp {
    public static void main(String [] args){
        Animal animal = new Animal(1);
        Animal animal2 = new Animal(2);
        System.out.println(animal.equals(animal2));
    }

}



class Animal{
    private int id;
    public Animal(int id){
        this.id = id;
    }

    public boolean equals(Object obj){
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}