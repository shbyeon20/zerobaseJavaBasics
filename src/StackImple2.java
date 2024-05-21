import java.util.Arrays;

public class StackImple2 {
    int[] arry;
    int top = -1;

    StackImple2(int size) {
        arry = new int[size];
    }

    public boolean isEmpty() {
        if (this.top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (this.top == arry.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int x) {
        if (isFull()){
            System.out.println("Stack is full");
        }else {
            arry[++top] = x;
        }
    }

    public Integer pop() {
        if(this.isEmpty()){
            System.out.println("Stack is empty");
        }else{
            return arry[top--];
        }
    return null;
    }
    public int peek() {
        return arry[top];
    }

    public void printstack(){
        Arrays.stream(arry).forEach(System.out::print);
    }



}
