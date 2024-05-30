package dataStructure.practice;

public class Stringlookup {
    public static void main(String[] args) {
        Solutionlookup solution = new Solutionlookup();
        System.out.println(solution.solution("174771177"));
    }
}


class Solutionlookup {
    public int solution(String s) {

        int[] cnt = new int[10];
        for (int j =0; j<10;j++){
            cnt[j] = 0;
        }

        for (int i =0; i<s.length();i++){
            int val = Integer.valueOf(s.substring(i,i+1));
            cnt[val]++;
        }

        int max = 0;
        for (int k = 0; k<10; k++){
            if (max <cnt[k]){
                max = cnt[k];
            }
        }

        int answer = max;
        return answer;
    }
}