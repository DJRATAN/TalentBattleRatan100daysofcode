import java.util.Scanner;
import java.lang.Math;

public class RatanPrajapati_day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int len = (int) Math.log10(num) + 1;
        int sum = 0;
        while (num > 0) {
            sum += (Math.pow((num % 10), len));
            num /= 10;
        }
        if (sum == temp) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
