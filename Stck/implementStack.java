package Stck;

class StackOverflowException extends Exception{
    @Override
    public String toString(){
        return "Stack Overflow";
    }
}

class StackUnderFlowException extends Exception{
    @Override
    public String toString(){
        return "Stack Underflow";
    }
}

class Stack{
    private int n;
    private int top;
    private int[] arr;
    public Stack(int n){
        this.n = n;
        top = 0;
        this.arr = new int[this.n];
    }
    public void push(int x)throws StackOverflowException{
        if(top<this.n){
        arr[top]=x;
        top++;}
        else{
            throw new StackOverflowException();
        }
    }
    public void pop()throws StackUnderFlowException{
        if(top>0){
            top--;
            System.out.println(this.arr[top]);
            arr[top] =0;
        }else{
            throw new StackUnderFlowException();
        }
    }
    public int peek()throws StackUnderFlowException{
        if(top>0)
            return arr[top-1];
        else
            throw new StackUnderFlowException();
    }
    public boolean isEmpty(){
        return top<=0;
    }
    public void show()throws StackUnderFlowException{
        if(this.isEmpty()) throw new StackUnderFlowException();
        for (int i : this.arr) {
            System.out.print(i + " ");
        }
        System.out.println("");  
    }
}

public class implementStack {
    public static void main(String[]args){
    Stack s = new Stack(5);
    // System.out.println(s.n);
    try{
    // s.pop();
    // s.push(1);
    // s.push(1);
    // s.push(1);
    // s.push(1);
    // s.push(1);
    // s.push(1);
    // s.push(1);
    // System.out.println("peeked :"+s.peek());  
    s.show();
    }catch(Exception e){
        System.out.println(e);
    }
    }

}
