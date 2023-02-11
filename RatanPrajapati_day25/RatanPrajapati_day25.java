import java.util.Scanner;

public class RatanPrajapati_day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double area_of_circle = 3.14*num*num;
        System.out.printf("%,.2f",area_of_circle);
    }
}
