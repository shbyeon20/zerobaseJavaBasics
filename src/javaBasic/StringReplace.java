package javaBasic;

public class StringReplace {

    public static String solution(String str, String to, String from) {


        String bucket = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == from.charAt(0)) {
                // check if its the same word
                boolean match = true;
                for (int j = 0; j < from.length(); j++) {
                    if (str.charAt(i+j) != from.charAt(j)) {
                        match= false;
                    }
                }
                if (match) {
                    bucket = bucket + to;
                    i+=from.length()-1;
                }else{
                    bucket = bucket + str.charAt(i);
                }
            } else {
                bucket += str.charAt(i);
            }

        }
        return bucket;
    }

    public static void main(String[] args) {
        String ex1 = "Hello Java, Nice to meet you! Java is fun!"; // from Java to 자바
        String from = "Java";
        String to = "자바";

        String ex2 = "POP";
        String from2 = "P";
        String to2 = "W";
        System.out.println(solution(ex1, to, from ));
        System.out.println(solution(ex2, to2, from2));


    }
}
