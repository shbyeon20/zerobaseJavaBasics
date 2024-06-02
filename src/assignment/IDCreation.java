package assignment;
import java.util.Random;
import java.util.Scanner;

public class IDCreation {
    int year;
    int month;
    int day;
    String gender;


    public IDCreation() {
        System.out.println("[주민등번호 계산]");

        boolean valid = true;
        while (valid) {
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("출생년도를 입력해 주세. (yyyy)");
                year = input.nextInt();
                input.nextLine();

                if (2020 < year && year < 2025) { // check if the value is valid
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
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("출생월을 입력해 주세. (mm)");
                month = input.nextInt();
                input.nextLine();

                if (0 < month && month < 13) { // check if the value is valid
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
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("출생일을 입력해 주세. (dd)");
                day = input.nextInt();
                input.nextLine();

                if (0 < day && day < 32) { // check if the value is valid
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
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("성별을 입력해 주세.(m/f)");
                gender = input.nextLine();

                if (gender.equals("m") || gender.equals("f")) { // check if the value is valid
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


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getGender() {
        return gender;
    }

    public static void main(String[] args) {
        String id="";
        IDCreation idCreation = new IDCreation();
        //parsing input
        int yy = idCreation.year-2000 ;
        int mm = idCreation.month;
        int dd = idCreation.day;
        id += Integer.toString(yy);
        id += Integer.toString(mm);
        id += Integer.toString(dd);
        id += "-";
        //assign gender val

        if (idCreation.gender.equals("m")) {
            id += "3";
        }else if (idCreation.gender.equals("f")) {
            id += "4";
        }

        //assign random val

        Random random = new Random();
        int rannumber = random.nextInt(1000_000);
        id+= rannumber;

        System.out.println(id);



    }


}