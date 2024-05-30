package dataStructure.practice;

import java.util.*;

public class Circle {
    public static void main(String[] args) {
        Main solution = new Main();
        System.out.println(solution.solution("one4seveneight"));
    }
}



    class Main {
        public int solution(String s) {

            HashMap<String,int[]> map  = new HashMap();

            map.put("ze",new int[] {0,4});
            map.put("on",new int[] {1,3});
            map.put("tw",new int[] {2,3});
            map.put("th",new int[] {3,5});
            map.put("fo",new int[] {4,4});
            map.put("fi",new int[] {5,4});
            map.put("si",new int[] {6,3});
            map.put("se",new int[] {7,5});
            map.put("ei",new int[] {8,5});
            map.put("ni",new int[] {9,4});

            String replace = "";

            for (int i=0; i<s.length();){
                try{int number = Integer.valueOf(s.substring(i,i+1));
                    replace = replace+s.substring(i,i+1);
                    i++;
                }
                catch(Exception exception){
                    String val = s.substring(i,i+2);
                    replace = replace+map.get(val)[0];
                    i += map.get(val)[1];
                }
            }



            int answer = Integer.parseInt(replace);;
            return answer;

        }
    }




