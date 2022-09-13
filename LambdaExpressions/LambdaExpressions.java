package LambdaExpressions;

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
       int a =  e.execute(10, 5);
        System.out.println(a);
    }
}

/*class ExecutableImplementation implements Executable {

    @Override
    public int execute() {
        System.out.println("Hello");
        return 1;
    }
}*/

public class LambdaExpressions {
    public static void main(String[] args) {
        Runner runner = new Runner();
        //runner.run(new ExecutableImplementation());//1 way to pass interface to parameters through new class
        /*runner.run(new Executable() {              //2 way to pass interface to parameters through anonymous class
            @Override
            public int execute(int x) {
                System.out.println("Hello");
                return x + y;
            }
        }); */
        int a = 1; //  variable should be final for using in Lambda
        runner.run((x,y) -> x + y + a); //3 way through lambda. it is a method without a name
        //лямбда вырадение - это метод без названия
        //без обозначений - return
    }
}
