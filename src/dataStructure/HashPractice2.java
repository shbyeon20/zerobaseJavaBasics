package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class HashPractice2 {



    class Solution {
        public int solution(String[][] clothes) {
            HashMap<String,Integer> hm = new HashMap();


            for (int i=0; i<clothes.length;i++ ){
                try{
                    int val = hm.get(clothes[i][1]) +1;
                    hm.put(clothes[i][1],val);
                }
                catch(Exception exception){
                    hm.put(clothes[i][1],1);
                }
            }

            int res = 0;
            for (Map.Entry<String,Integer> entry : hm.entrySet()){
                res +=entry.getValue();
            }

            int answer = res -1;
            return answer;
        }
    }
}
