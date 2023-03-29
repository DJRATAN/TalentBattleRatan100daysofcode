import java.util.Scanner;

public class RatanPrajapati_day67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int S = sc.nextInt();
            int W1 = sc.nextInt();
            int W2 = sc.nextInt();
            int W3 = sc.nextInt();

            if (S >= (W1 + W2 + W3)) {
                System.out.println("1");
            } else if (S >= (W1 + W2)) {
                System.out.println("2");
            } else if (S >= (W2 + W3)) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}