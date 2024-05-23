package dataStructure;

import java.util.*;

class ArrayEx2 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer_temp = new ArrayList();


        for (int i = 0 ; i < arr.length;i++){
            if(arr[i]%divisor ==0){
                answer_temp.add(arr[i]);
            }
        }
        int[] answer = new int[answer_temp.size()];
        answer_temp.sort(Comparator.naturalOrder());

        for (int j = 0 ; j<answer.length;j++){
            answer[j]= answer_temp.get(j);
        }




        return answer;
    }
}