package Stack;

public class StackUse {
    public static void main(String[] args) throws StackFullException {
         StackUsingArray stack = new StackUsingArray(3);
         //stack.top=100; we dont push directly because top is private data member

         for(int i=1;i<=10;i++){
           stack.push(i);
           
         }

         while (!stack.isEmpty()) {
            try{
                System.out.println(stack.pop());
            }
            catch(StackEmptyException e){
                // never reach here
            }
            
         }
    }
    
}
