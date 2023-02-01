import java.util.Scanner;

public class RatanPrajapati_day15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0, rem = 0;
        while (num != 0) {
            rem = num % 10;
            num /= 10;
            sum += factorial(rem);
        }
        if (temp == sum) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }
    }

    public static int factorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
