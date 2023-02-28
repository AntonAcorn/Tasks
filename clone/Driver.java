package clone;

public class Driver implements Cloneable{
    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Driver clone() throws CloneNotSupportedException {
        return (Driver) super.clone();
    }
}
