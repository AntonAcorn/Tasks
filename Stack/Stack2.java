package Stack;
import java.util.Stack;
//кто зашел посленим - выходит первым
//last in first out
public class Stack2  {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        //5 <-3 <- 1
        //как стопка блинов. кладем первый в самый низ и берем с конца
        stack.push(5);
        stack.push(3);
        stack.push(1);

        //System.out.println(stack.peek());  //не извлекает элемент, а просто показывает
        //System.out.println(stack.pop());

        while (!stack.empty()){
            System.out.println(stack.pop());
        }
        //1 -> 3 -> 5

    }
}
