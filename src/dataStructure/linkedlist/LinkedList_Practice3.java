package dataStructure.linkedlist;

import java.util.LinkedList;
import java.util.ArrayList;


class  LinkedList_Practice3{


class Solution {

    public static void main(String[] args) {
    }


    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {

        int len = progresses.length;
        LinkedList<Integer> daysToTake = new LinkedList();
        ArrayList<Integer> answer = new ArrayList();

        for (int i = 0; i<len;i++){
            double days = (100 - progresses[i])/(double)speeds[i];
            days = Math.ceil(days);
            daysToTake.add((int)days);
        }

        while (daysToTake.size()!=0){
            int tmp = daysToTake.removeFirst();
            int cnt = 1;
            while (daysToTake.get(0)<=tmp){
                daysToTake.removeFirst();
                cnt++;
            }
            answer.add(cnt);
        }




        return answer;
    }
}
}