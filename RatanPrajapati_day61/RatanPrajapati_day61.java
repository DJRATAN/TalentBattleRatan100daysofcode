import java.util.Scanner;

public class RatanPrajapati_day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = a + b;
            if (ans < 3) {
                System.out.println("1");
            } else if (ans >= 3 && ans <= 10) {
                System.out.println("2");
            } else if (ans >= 11 && ans <= 60) {
                System.out.println("3");
            } else {
                System.out.println("4");
            }
        }
    }
}
