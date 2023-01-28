import java.util.Scanner;

public class RatanPrajapati_day11 {

    static void fibonacci(int num) {
        int num1 = 0, num2 = 1, sum;

        for (int i = 0; i < num; i++) {
            sum = num1 + num2;
            System.out.print(num1 + ",");
            num1 = num2;
            num2 = sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fibonacci(num);
    }
}
