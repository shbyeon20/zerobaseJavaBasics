

import java.util.*;

public class Test {
    public static void main(String[] args) {
Solution solution = new Solution();
        System.out.println(solution.solution(new int[] {1,1,9,1,1,1},	0));
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        int len = priorities.length;
        int[][] prio_loc = new int[len][2];

        for (int i =0; i<len;i ++){
            prio_loc[i][0] = priorities[i];
            prio_loc[i][1] = i;
        }


        LinkedList<int []> prioque = new LinkedList();
        for (int[] arr : prio_loc) {
            prioque.add(arr);
        }


        Arrays.sort(priorities);

        int idx = len-1;
        int cnt =0;
        while(true){
            
            
            for (int[] ints : prioque) {
                System.out.print(Arrays.toString(ints));
            }
            for (int priority : priorities) {
                System.out.print(priority);
            }
            
            int[] temp =prioque.removeFirst();
            
            if (temp[0] == priorities[idx]){
                cnt++;
                idx--;
                if (temp[1]==location){
                    break;
                }

                continue;
            }
            prioque.addLast(temp);

        }


        int answer = cnt;
        return answer;
    }
}