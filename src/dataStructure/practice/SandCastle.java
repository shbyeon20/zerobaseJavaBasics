package dataStructure.practice;

import java.util.stream.IntStream;

public class SandCastle {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution(1016));
        int [] arry = IntStream.range(1,1001).forEach(n->0).toArray();
    }


}

class Solution2 {
        public boolean solution(int num){

            int[] winarr = new int[100001];


            winarr[0] = 0;
            winarr[1] = 0;
            winarr[2] = 1;
            winarr[3] = 1;
            winarr[4] = 1;
            winarr[5] = 0;


            for (int i = 6; i < winarr.length; i++) {
                winarr[i] = 1;
                if (winarr[i - 1] == 1 && winarr[i - 2] == 1 && winarr[i - 3] == 1) {
                    winarr[i] = 0;
                }
            }


            if (winarr[num] == 0) {
                return false;
            } else if (winarr[num] == 1) {
                return true;
            }


            return false;
        }


}




