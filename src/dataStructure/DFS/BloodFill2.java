package dataStructure.DFS;

import java.util.ArrayList;

public class BloodFill2 {
    public static void main(String[] args) {
        Solution_BloodFill2 solutionBloodFill2 = new Solution_BloodFill2();
        System.out.println(solutionBloodFill2.Solution_BloodFill2(new int[][]{{0, 1, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 1, 0}, {0, 0, 1, 1, 0}}));
        System.out.println(solutionBloodFill2.Solution_BloodFill2(new int[][]{{1, 1, 1, 0, 1}, {1, 1, 1, 0, 1}, {0, 0, 1, 0, 0}, {1, 1, 0, 1, 0}, {1, 0, 1, 0, 0}}));
        System.out.println(solutionBloodFill2.Solution_BloodFill2(new int[][]{{0, 0, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 0, 0}, {1, 0, 0, 1, 0}, {0, 0, 1, 1, 0}}));
        System.out.println(solutionBloodFill2.Solution_BloodFill2(new int[][]{{0, 0, 0, 0, 1}, {0, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 1, 0}, {0, 0, 1, 0, 0}}));
    }

}

class Solution_BloodFill2 {
    ArrayList<Integer> answer = new ArrayList<>();
    static int blockSize = 0;
    static int[] mr = {+1,-1, 0,0};
    static int[] mc = {0,0,+1,-1};

    ArrayList<Integer> Solution_BloodFill2(int[][] board) {
        answer.clear();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    DFS(i,j,board);
                    answer.add(blockSize);
                    blockSize = 0;
                }
            }
        }
        return answer;
    }

    void DFS(int row, int column, int[][] board) {
        blockSize ++;
        board[row][column] = 0;
        for (int i = 0; i < 4; i++) {
            if (0<=row+mr[i]&&row+mr[i]<=4&&0<=column+mc[i]&&column+mc[i]<=4&&board[row+mr[i]][column+mc[i]] == 1) {
                DFS(row+mr[i],column+mc[i],board);
            }
        }
    }
}
