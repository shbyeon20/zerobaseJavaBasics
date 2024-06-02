package assignment;

public class Timetable {

    public static void main(String[] args) {
        System.out.println("[구구단 출력]");

        for ( int i =1; i<10;i++){
            for (int j = 1; j<10; j++){
                //결과값 0으로 padding처리
                String res = String.format( "%02d" , i*j);
                System.out.print( "0"+i+" x "+"0"+j+" = "+res+"   ");
            }
            System.out.println();
        }
    }
}
