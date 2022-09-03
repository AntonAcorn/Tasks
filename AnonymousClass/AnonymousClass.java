package AnonymousClass;

/*public class AnonymousClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal2 = new Animal(){
            public void eat(){
                System.out.println("Second animal is eating");
            }
        };

        animal2.eat();
//Создавать отдельный класс для переопределения одного метода - слишком много кода.-> anonymous class
//Creating a separate class to override one method is too much code.-> anonymous class
//При создании класса после него {} и переопределенный метод
//When creating a class after it {} and overridden method
    }
}

class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}
*/

interface AbleToEat{
    public void eat();
}

public class AnonymousClass {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            // Здесь не создается объект класса интерфейс, потому что это невозможно,
            // Здесь скрыто создается анонимный класс, который создается на один раз
            // No interface class object is created here because it's not possible,
            // An anonymous class is implicitly created here, which is created at a time
            @Override
            public void eat() {
                System.out.println("Someone is eating");
            }
        };
        ableToEat.eat();
    }
}



