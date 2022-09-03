package Generics;

public class Animal {
    private int id;
    public Animal(){
    }
    public Animal(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return id + "";
    }
}
