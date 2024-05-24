package javaBasic;

import java.util.Arrays;
import java.util.StringTokenizer;

public class CandyDistribution {
    public static void main(String[] args) {
        solution("1 2 3");
        solution("3 2 1");
        solution("1 0 2");
        solution("1 2 2");
        solution("1 3 5 3 1 3 5 7 5 3 1 0");

    }

    static void solution(String input){
        StringTokenizer st = new StringTokenizer(input);
        int len = st.countTokens();
        int [] score = new int[len];
        int [] candy = new int[len];
        Arrays.fill(candy, 1);

        for (int i=0; i< len; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }
        boolean valid = true;
        while (valid){
            valid = false;
            for (int i=0; i< len-1; i++) {
                if (score[i] > score[i + 1] && candy[i] <= candy[i + 1]) {
                    candy[i]++;
                    valid = true;
                }
            }
            for (int i=len-2; i>-1; i--) {
                if (score[i] < score[i + 1] && candy[i] >= candy[i + 1]) {
                    candy[i+1]++;
                    valid = true;
                }
            }
        }
        int sum = 0;
        for (int i : candy) {
            sum+=i;
        }
        System.out.println(sum);

    }
}
