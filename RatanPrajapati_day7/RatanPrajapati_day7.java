import java.util.Scanner;

public class RatanPrajapati_day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month : ");
        int month = sc.nextInt();
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30");
        } else if (month == 2) { 
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("29");
                    } else {
                        System.out.println("28");
                    }
                } else {
                    System.out.println("29");
                }
            } else {
                System.out.println("28");
            }
        } else {
            System.out.println("Invalid month");
        }
    }

}
