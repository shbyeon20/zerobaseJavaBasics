package assignment;


//변상화 제로베이스 미니과제6, mini-assgn-bsh06.java

import java.util.Random;
import java.util.Scanner;

public class VotingSimu {
    private int voteTtl;
    private int candidateNumber;
    private String[] candidates;
    private int[] votes;

    public VotingSimu() {
        Scanner sc = new Scanner(System.in);

        System.out.print("총 진행할 투표수를 입력해주세요 ");
        this.voteTtl = sc.nextInt();
        sc.nextLine();

        System.out.print("가상 선거를 진행할 후보자 인원을 입력해주세요 ");
        this.candidateNumber = sc.nextInt();
        sc.nextLine();
        candidates = new String[candidateNumber + 1];


        // candidate input reception
        for (int i = 1; i < this.candidateNumber + 1; i++) {
            System.out.printf("%d번째 후보자를 입력해주세요 ", i);
            String name = sc.nextLine();

            // assign and check the number is overlap
            Random random = new Random();
            boolean valid = true;
            while (valid) {
                int rannum = random.nextInt(1, this.candidateNumber + 1);
                if (candidates[rannum] == null) {
                    valid = false;
                    candidates[rannum] = name;
                }
            }
        }

    }

    public static void main(String[] args) {
        VotingSimu simu = new VotingSimu();
        simu.SimulatinStart();
        simu.ResultCnt();

    }

    private void ResultCnt() {
        int max = 0;
        int max_index = 0;
        for (int i = 0; i < votes.length; ++i) {
            if (votes[i] > max) {
                max = votes[i];
                max_index = i;
            }
        }
        System.out.printf("[투표결과] 당선인 : %s", candidates[max_index]);

    }

    private void SimulatinStart() {
        votes = new int[candidateNumber + 1];
        Random random = new Random();
        //
        for (int i = 0; i < voteTtl; i++) {
            int cannum = random.nextInt(1, this.candidateNumber + 1);
            votes[cannum] += 1;
            System.out.printf("[기호:%d] %-3s %.2f%% (투표수: %d) ", cannum, this.candidates[cannum] + ":", (votes[cannum]) / (double) (voteTtl) * 100, votes[cannum]);
            System.out.println();
        }
        System.out.println();
    }
}