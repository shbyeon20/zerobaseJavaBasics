package dataStructure.DFS;

public class AscendingOrder {
    static int[] chk = new int[10];
    static int cnt = 0;

    public static void main(String[] args) {
        DFS(0,3,0,0);
        System.out.println(cnt);

    }

    public static void DFS(int level, int depth, int sum, int prev) {
        if (level == depth) {
            System.out.println(sum);
            cnt++;
        } else {
            for (int i = prev + 1; i <= 9; i++) {
                if (chk[i] == 0) {
                    chk[i] = 1;
                    DFS(level + 1, depth , sum * 10 + i, i);
                    chk[i] = 0;
                }
            }
        }

    }
}
