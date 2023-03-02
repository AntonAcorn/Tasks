package clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Corvet", new Driver("Vasya", 45));
        Car clonedCar = car.clone();

        System.out.println(car);
        System.out.println(clonedCar);

        Driver cloneDriver = clonedCar.getDriver();
        cloneDriver.setName("Lesha");

        System.out.println();
        System.out.println(clonedCar);
        System.out.println(car);

    }
}
