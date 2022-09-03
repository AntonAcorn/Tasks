package ElectroCar;

public class ElectroCar {
    private int id;
    private static int test;


    //Вложенный нестатический класс(как правило, они private и имеют доступ к полям объекта)
    // Это как бы подобъеты одного сложного механизма
    // нужны для реализации логики внутри одного класса, поэтому private
    // Если объект сложный и его можно разюить на несколько подобъектов
    // Такие классы чаще всего являются частью основного класса
    private class Motor{
        public void startMotor(){
            System.out.println("Motor "+ id + " is starting");
        }
    }

    //Вложенный статический класс
    //он не имеет доступа к  ID, потому что явдяется статическим. В статическом методе можно обращаться только к статическим переменным
    //Используется, когда нам нужно сгруппировать два класса
    //Они связанны только статическими полями и больше ничем
    //Эти классы часто используется из вне
    //И по логике не являются частью основного класса
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging " + test);
        }
    }

    public ElectroCar (int id){
        this.id = id;
    }
    public void start(){
        //Вложенный класс в методе. Он имеет доступ к нестатическим полям и к переменным метода
        final int x = 1;        //вложенный класс может обращаться только к константе метода
        class SomeClass{
            public void method(){

            }
        }
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar " + id + " is starting");
    }
}
