package assignment;

//변상화 제로베이스 미니과제5, mini-assgn-bsh05.java

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Calendar {
    int year;
    int month;


    public Calendar() {
        // receive user input
        Scanner input = new Scanner(System.in);
        boolean valid = true;
        while (valid) {
            try {
                System.out.print("달력의 년도를 입력해 주세요. (yyyy)");
                year = input.nextInt();
                input.nextLine();

                if (0 <= year && year <= 9999) { // check if the value is valid
                    valid = false;
                } else {
                    System.out.println("유효하지 않은 입력값입니다.");
                }
            } catch (Exception e) {
                System.out.println("유효하지 않은 입력값입니다.");
                input.nextLine();
            }
        }

        valid = true;
        while (valid) {
            try {
                System.out.print("달력의 월을 입력해 주세요. (mm)");
                month = input.nextInt();
                input.nextLine();

                if (2 <= month && month <= 11) { // check if the value is valid
                    valid = false;
                } else {
                    System.out.println("유효하지 않은 입력값입니다.");
                }
            } catch (Exception e) {
                System.out.println("유효하지 않은 입력값입니다.");
                input.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        // get int value from whateverday of first date of month, adjust int value for pringting
        // [0] : start of the month and adjust value for day of week, [1] end of the month

        int[] thisMonth = dayValDefaultSetting(calendar.year, calendar.month);
        int[] nextMonth = dayValDefaultSetting(calendar.year, calendar.month + 1);
        int[] lastMonth = dayValDefaultSetting(calendar.year, calendar.month - 1);


        for (int i = 0; i < 3; i++) {
            System.out.printf("[%d년 %02d월]", calendar.year, (calendar.month - 1 + i));
            System.out.print("                         ");
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print("일   월   화  수  목   금   토");
            System.out.print("           ");
        }
        System.out.println();


        for (int j = 0; j < 5; ++j) {
            // sperate different calendar with spacing and repeat the loop
            printCalendar(lastMonth);
            System.out.print("         ");

            printCalendar(thisMonth);
            System.out.print("         ");

            printCalendar(nextMonth);
            System.out.println();
        }
    }

    private static void printCalendar(int[] lastMonth) {
        // only print number when arry[0] is in range at 7times
        for (int i = 0; i < 7; ++i) {
            lastMonth[0]++;
            if (lastMonth[0] > lastMonth[1] || lastMonth[0] < 1) {
                System.out.print("    ");
            } else {
                System.out.printf("%02d  ", lastMonth[0]);
            }

        }
    }

    private static int[] dayValDefaultSetting(int year, int month) {
        // get int value from whateverday of first date of month, adjust int value for pringting
        int[] arry = new int[2];
        LocalDate date = LocalDate.of(year, month, 1);
        arry[1] = date.lengthOfMonth(); // 해당월의 말일을 저장

        DayOfWeek dayOfWeek = date.getDayOfWeek(); // 월요일을 1 일요일을 7로 지정하고 숫자값얻기
        arry[0] = dayOfWeek.getValue() * (-1);
        return arry;
    }

}