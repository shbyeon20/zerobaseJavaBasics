// Java 프로그래밍 - 변수와 자료형_3

public class Var1 {
    public static void main(String[] args) {

//      1. 자료형 - 문자열
        System.out.println("== 문자열 ==");
        String s1 = "hello world";
        System.out.println("s1 = " + s1);
        String s2 = "01234";
        System.out.println("s2 = " + s2);

//      1-1. equals

        String s3 = "hi";
        String s4 = "hi";
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
        String s5 = new String("hi");
        System.out.println(s4==s5);
        System.out.equals(s4==s5);




//      1-2. indexOf

        String s6 = "hello! world!";
        System.out.println(s6.indexOf("!"));
        System.out.println(s6.indexOf("!",s6.indexOf("!")+1));


//      1-3.
        String s7 = s6.replace("hello","bye");
        System.out.println(s7);


//      1-4. substring
        System.out.println(s7.substring(0,3));


//      1-5. toUpperCase
        System.out.println(s7.toUpperCase());



//      2. 자료형 - StringBuffer
        System.out.println("== StringBuffer ==");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println(sb1);
        sb1.append("5678");
        System.out.println(sb1);

        String a = "01234";
        String b = "56789";
        a+=b;
        System.out.println(a);



//      3. 자료형 - 배열
        System.out.println("== 배열 ==");


    }
}
