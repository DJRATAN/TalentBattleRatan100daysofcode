import java.util.Scanner;

public class RatanPrajapati_day63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int w1 = sc.nextInt();
            int w2 = sc.nextInt();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int M = sc.nextInt();

            x1 *= M;
            x2 *= M;

            int wmin = w1 + x1;
            int wmax = w1 + x2;

            if (w2 >= wmin && w2 <= wmax) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
