package dataStructure.tree;

// 중복순열 구하기
public class Practice2 {
    static int N = 3;
    static int R = 2;
    static int[] arry = new int[R];

    public static void main(String[] args) {
        Practice2 practice = new Practice2();

        DFS(3, 0, 2);

    }

    public static void DFS(int repeat, int str, int end) {
        if (str == end) {
            return;
        }

        for (int i = 1; i <= repeat; i++) {
            arry[str] = i;
            DFS(repeat, str + 1, end);

            if (str == end - 1) {
                for (int j : arry) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }


    }
}

