package Stack;

public class StackUsingArray {
    private int data[];
    private int top; // it is the top index of the stack

    public StackUsingArray(){
        data=new int[10];
        top=-1;
    }
    public StackUsingArray(int Capacity){
        data = new int[Capacity];
        top=-1;
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public int size(){
        return top+1;
    }
    public int top() throws StackEmptyException{
        if(size()==0){
            // stack empty throw exception
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return data[top];
    }
        public void push(int elem) throws StackFullException{
            if(size()==data.length){
                // stack full exception
                // StackFullException e = new StackFullException();
                // throw e;
                doubleCapacity();
            }
            top++;
            data[top] = elem;
        }

        private void doubleCapacity(){
            int temp[] = data;
            data = new int[2*temp.length];
            for(int i=0;i<=top;i++){
                data[i]=temp[i];
            }
        }
            public int pop() throws StackEmptyException{

                if(size()==0){
                    // stack empty throw exception
                    StackEmptyException e = new StackEmptyException();
                    throw e;
                }

                int temp = data[top];
                top--;
                return temp;

            }
        }
    
    

