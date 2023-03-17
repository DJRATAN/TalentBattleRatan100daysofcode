import java.util.Scanner;

public class RatanPrajapati_day57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int P = sc.nextInt();

            int gotMarks = X * 3 - (N - X);
            if (gotMarks >= P) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
    }
}
