package clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Corvet", new Driver("Vasya", 45));
        Car clonedCar = car.clone();

    }
}
