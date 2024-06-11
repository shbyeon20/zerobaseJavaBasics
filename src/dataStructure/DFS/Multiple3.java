package dataStructure.DFS;

import java.util.Stack;

public class Multiple3 {
    static int N = 8;
    static int R = 2;
    static int[] chk = new int[N+1];
    static Stack<Integer> stk = new Stack();


    static int cnt = 0 ;



    public static void main(String[] args) {
        DFS(0,R,N);
        System.out.println(cnt);


    }

    public static void DFS(int level, int depth, int range){

        if(level == depth&&stk.stream().reduce(0,(a,b)->a*10+b)%3==0) {
            System.out.println(stk.toString());
            cnt++;
            return;
        }else {
            for(int i = 1 ; i <= range ; i++){
                if(chk[i] == 0){
                    chk[i] = 1;
                    stk.push(i);
                    DFS(level+1,depth,range);
                    stk.pop();
                    chk[i] = 0;
                }
            }
        }
    }
}
