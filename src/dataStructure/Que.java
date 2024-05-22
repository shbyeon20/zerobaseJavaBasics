package dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Que {
    ArrayList list;

    public Que() {
        this.list = new ArrayList();
    }

    public static void main(String[] args) {
        Queue q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
         System.out.println(q);
    }

    public void push(int x) {
        list.add(x);
    }




}
