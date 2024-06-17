package dataStructure.DFS;

public class BloodFill1 {
    public static void main(String[] args) {
        SolutionBloodFill1 solutionBloodFill1 = new SolutionBloodFill1();
        System.out.println(solutionBloodFill1.SolutionBloodFill1(new int[][] {{0, 1, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 1, 0}, {0, 0, 1, 1, 0}}));
        System.out.println(solutionBloodFill1.SolutionBloodFill1(new int[][] {{1, 1, 1, 0, 1}, {1, 1, 1, 0, 1}, {0, 0, 1, 0, 0}, {1, 1, 0, 1, 0}, {1, 0, 1, 0, 0}}));
        System.out.println(solutionBloodFill1.SolutionBloodFill1(new int[][] {{0, 0, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 0, 0}, {1, 0, 0, 1, 0}, {0, 0, 1, 1, 0}}));
        System.out.println(solutionBloodFill1.SolutionBloodFill1(new int[][] {{0, 0, 0, 0, 1}, {0, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 1, 0}, {0, 0, 1, 0, 0}}));

    }
}

class SolutionBloodFill1{
    int answer;
    static int[] dr = {1,-1,0,0};
    static int[] dc = {0,0,-1,1};

    int SolutionBloodFill1(int [][] board){
        answer =0;

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] == 1){
                    DFS(i,j,board);
                    answer++;
                }
            }
        }


        return answer;
    }


    static void DFS(int i , int j, int[][] board){
        board[i][j] = 0;
        for (int k =0; k < 4; k++){
            if (0<=i+dr[k]&&i+dr[k]<5&&0<=j+dc[k]&&j+dc[k]<5&&board[i+dr[k]][j+dc[k]]==1){
                DFS(i+dr[k],j+dc[k],board);
            }
        }

    }
}
