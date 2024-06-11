package dataStructure.DFS;

import java.util.Stack;

public class Lineup {
    static Stack<Character> stack = new Stack();
    static int N=5;
    static int[] chk = new int[N];

    public Lineup(int N) {
        this.N = N;
    }

    public static void main(String[] args) {
        DFS(0,5);




    }


    public static void DFS(int Level, int N ){
        if (Level == N){
            System.out.println(stack.toString());
        }else{
            for (int i = 0; i < N; i++) {
                char temp = (char)('A'+i);
                boolean neighborAB;
                boolean neighborBA;

                if (stack.isEmpty()){
                    neighborAB=false;
                    neighborBA=false;
                }else {
                    neighborAB = (stack.peek() == 'A' && temp == 'B');
                    neighborBA = (stack.peek() == 'B' && temp == 'A');
                }

                if (!neighborAB&&!neighborBA&&chk[i]!=1){
                chk[i]=1;
                stack.push(temp);
                DFS(Level+1, N);
                stack.pop();
                chk[i]=0;
                }
            }
        }
    }
}

