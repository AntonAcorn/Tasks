package clone;

public class Car implements Cloneable{
    private String name;
    private Driver driver;

    public Car(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(Car newCar) throws CloneNotSupportedException {
        this(newCar.getName(), newCar.getDriver().clone());
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car newCar = (Car) super.clone();
        Driver newDriver = this.getDriver().clone();
        newCar.setDriver(newDriver);
        return newCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", driver=" + driver +
                '}';
    }
}
