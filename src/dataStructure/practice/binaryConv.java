package dataStructure.practice;

public class binaryConv {
    public static void main(String[] args) {

    }
}


    class Solution {
        public int solution(String S) {

            int cnt1 = 0;
            int cnt0 = 0;
            for ( int i =0; i <S.length();i++){
                char tem = S.charAt(i);
                if (tem =='1'){
                    cnt1++;
                }else if (tem == '0'){
                    cnt0++;
                }
            }




            int answer = cnt0+cnt1*2-1;
            return answer;
        }
    }
