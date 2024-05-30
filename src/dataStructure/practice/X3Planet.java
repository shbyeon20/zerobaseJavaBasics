package dataStructure.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class X3Planet {

}

class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arry = new int[N];
        for (int i = 0; i < N; i++) {
            arry[i] = Integer.parseInt(br.readLine());
        }


        System.out.println(solution(N, arry));
    }

    static int solution(int N, int[] arry) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int res = arry[i] ^ arry[j];
                sum += res;
            }

        }
        return sum;
    }
}
