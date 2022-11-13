package polymorphism.andInteface;

public class Duck implements Swim{
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(toString() + ". Я умею плавать");
    }
    public String toString(){
        return "Я утка! " + name;
    }

}
