package dataStructure.DFS;

import java.util.Stack;


public class Travel {

    static Stack<Character> stack = new Stack<>();
    static int[] chk = new int[(int) ('Z' - 'A' + 1)];

    public static void main(String[] args) {
        DFS(0, 3, 5);


    }


    public static void DFS(int level, int maxLevel, int numbermax) {
        if (level == maxLevel) {
            System.out.println(stack.toString());
            return;
        }

        for (int i = 0; i < numbermax; i++) {
            if (chk[i] == 0) {
                chk[i] = 1;
                stack.push(Character.valueOf((char) (i + 'A')));
                DFS(level + 1, maxLevel, numbermax);
                stack.pop();
                chk[i] = 0;
            }

        }
    }
}


