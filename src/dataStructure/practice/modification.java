package dataStructure.practice;

import java.util.Arrays;

public class modification {
    public static void main(String[] args) {
        int[] arry = solution(new int[]{1, 3, 5, 7, 9});
        Arrays.stream(arry).forEach(System.out::println);

    }

    static int[] solution(int[] arr) {
        int[] arrOrg = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrOrg[i] = 0;
        }

        arrOrg[0] = arr[0];

        int idx = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int i1 : arrOrg) {
                System.out.print(i1);
            }
            System.out.println();

            idx = (arrOrg[idx] + idx) % arr.length;

            while (arrOrg[idx] != 0) {
                idx = (idx + 1)% arr.length;
                if (idx == -1) {
                    idx = arr.length - 1;
                }
            }
            arrOrg[idx] = arr[i + 1];
        }
        return arrOrg;
    }

}

