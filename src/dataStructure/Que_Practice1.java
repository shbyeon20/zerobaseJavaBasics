package dataStructure;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Que_Practice1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        ArrayList<Integer> targetArray = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            targetArray.add(Integer.parseInt(st2.nextToken()));
        }


        System.out.println(solution(N, M, targetArray));

    }

    public static int solution(int N, int M, ArrayList<Integer> arr) {
        LinkedList<Integer> que = new LinkedList<>();
        IntStream.range(1, N + 1).forEach(que::add);

        int cnt = 0;

        for (Integer i : arr) {
            int index = que.indexOf(i); // find the index of the given value
            // decide which way to rotate
            if (index <= ((que.size() / 2))) {
                while (true) {
                    if (que.get(0) == i) {
                        que.removeFirst();
                        break;
                    }
                    int temp = que.removeFirst();
                    que.addLast(temp);
                    cnt++;
                }
            } else {
                while (true) {
                    if (que.get(0) == i) {
                        que.removeFirst();
                        break;
                    }
                    int temp = que.removeLast();
                    que.addFirst(temp);
                    cnt++;
                }

            }

        }

        return cnt;
    }


}
