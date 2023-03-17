import java.util.Scanner;

public class RatanPrajapati_day58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int K = sc.nextInt();
            int X = sc.nextInt();

            int remaining = K - X;
            if (remaining > 0) {
                System.out.println(remaining);
            } else if (remaining == 0) {
                System.out.println("It is Already Filled");
            }
        }
    }
}
