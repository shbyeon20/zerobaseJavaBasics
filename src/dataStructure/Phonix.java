package dataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Phonix {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numb = Integer.parseInt(br.readLine().trim());

        String arrayStr = br.readLine();
        StringTokenizer st = new StringTokenizer(arrayStr, " ");

        Integer[] numbers = new Integer[numb];
        int index = 0;
        while (st.hasMoreTokens()) {
            numbers[index++] = Integer.parseInt(st.nextToken());
        }


        solution(numbers);
        br.close();
    }

    public static void solution(Integer[] numbers) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer>[] stacks = new Stack[4];

        for (int i = 0; i < 4; i++) {
            stacks[i] = new Stack<Integer>();
        }
        stacks[0].push(numbers[0]);


        for (int i = 1; i < numbers.length; i++) {
            int empty = -1;
            int min_index = -1;
            int indextoput = -1;
            int gapmin = 1000000;

            for (int j = 0; j < 4; j++) {
                if (stacks[j].empty()) {
                    empty = j;
                    continue;
                } else {
                    // check smallest gap
                    int gap = numbers[i] - stacks[j].peek();
                    if (gapmin > gap && gap > 0) {
                        gapmin = gap;
                        indextoput = j;
                    }
                }
            }

            if (indextoput == -1) {
                if (empty == -1) {
                    bw.write("NO");
                    bw.close();
                    return;
                } else {
                    stacks[empty].push(numbers[i]);
                }
            } else {
                stacks[indextoput].push(numbers[i]);
            }
        }
        bw.write("YES");
        bw.close();
    }



}


