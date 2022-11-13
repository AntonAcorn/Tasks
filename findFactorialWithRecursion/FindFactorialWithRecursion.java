package findFactorialWithRecursion;
public class FindFactorialWithRecursion {
    public static void main (String [] args){
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        System.out.println(n);
        return n * factorial(n-1);

    }
}


