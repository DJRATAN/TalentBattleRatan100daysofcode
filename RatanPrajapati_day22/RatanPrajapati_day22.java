import java.util.Scanner;

public class RatanPrajapati_day22 {
    static boolean isPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (isPrime(i)) {
                if (isPrime(num - i)) {
                    System.out.printf("%d can be expressed as sum of %d and %d\n", num, i, num - i);
                    flag = true;
                }
            }
        }
        if (!flag)
            System.out.println(num + "can't express that number as sum of two prime numbers.");
    }
}