package Stack;
import java.util.Stack;
public class Test1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<10;i++){
            stack.push(i*2);
    }
    System.out.println(stack.peek()); // peek() throw the last first pop element
}
}