package dataStructure.tree;
//순열구하기

import java.util.Stack;

public class Practice3 {
    static int limit =3;
    static int number = 8;
    static int [] arry = new int[limit];
    static int [] chk = new int[number];
    Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Practice3 practice3 = new Practice3();
        practice3.DFS(0,number,limit,chk);
    }

    public void DFS(int level, int number, int limit, int[] chk){


        if (level ==limit){
            for (int i : stack) {
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i < number; i++) {
            if(chk[level] == 0) {
                stack.push(i);
                chk[i] = 1;
                DFS(level + 1, number, limit, chk);
                stack.pop();
                chk[i] = 0;
            }
        }


    }
}

