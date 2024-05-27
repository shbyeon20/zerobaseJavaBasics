package dataStructure.practice;
import java.util.*;
import java.util.stream.Collectors;

public class Class {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[] {2,1,3,2},2));
    }
}



class Solution {
    public int solution(int[] priorities, int location) {

        ArrayList<Integer> priorlist = new ArrayList (Arrays.stream(priorities).boxed().collect(Collectors.toList()));
        priorlist.sort(Comparator.reverseOrder());

        LinkedList<int[]> prioloc = new LinkedList<>();
        for (int i =0;i<priorities.length;i++){
            prioloc.add(new int[] {priorities[i],i});
        }

        int cnt = 0;// cnt of pop
        int idx = 0;// priorities idx

        while(true){
            int[] temp =  prioloc.removeFirst();

            if(temp[0]== priorlist.get(idx)){
                cnt++;
                idx++;
                if(temp[1]==location){
                    break;
                }
                continue;
            }
            prioloc.add(temp);
        }


        int answer = cnt;
        return answer;
    }
}