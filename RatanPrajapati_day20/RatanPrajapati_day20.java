import java.util.Scanner;

public class RatanPrajapati_day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number  ");
        } else {
            boolean isprime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number  ");
            }
        }
    }
}
