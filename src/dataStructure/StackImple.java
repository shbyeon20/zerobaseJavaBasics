package dataStructure;

import java.util.ArrayList;

public class StackImple {
    ArrayList list;

    public StackImple() {
        this.list = new ArrayList();
    }

    public boolean isEmpty() {
        if (this.list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int value) {
        this.list.add(value);
    }

    public Integer pop() {
        if (this.list.isEmpty()) {
            System.out.println("stack is empty");
            return null;
        } else {
            int data = (int) this.list.get(list.size() - 1);
            this.list.remove(list.size() - 1);
            return data;
        }
    }

    public Integer peek() {
        if (this.list.isEmpty()) {
            System.out.println("stack is empty");
            return null;
        } else {
            int data = (int) this.list.get(list.size() - 1);
            return data;
        }
    }
    public void printstack(){
        System.out.println(this.list);
    }
}
