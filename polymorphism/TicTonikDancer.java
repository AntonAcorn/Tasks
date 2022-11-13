package polymorphism;

public class TicTonikDancer extends Dancer {
    public TicTonikDancer(String name, int age){
        super(name, age);
    }

    public void dance(){
        System.out.println(toString() + " Я такнцую tictonik");
    }
}
