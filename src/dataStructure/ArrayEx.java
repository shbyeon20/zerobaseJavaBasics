package dataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayEx {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arry = new int[N];

        for (int i = 0; i < N; i++) {
            arry[i] = Integer.parseInt(st.nextToken());
        }

        solution(arry);
    }


    static void solution(int[] arry) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arry.length; i++) {
            min = Math.min(min, arry[i]);
            max = Math.max(max, arry[i]);

        }

        System.out.println(min+" "+max);


    }
}
