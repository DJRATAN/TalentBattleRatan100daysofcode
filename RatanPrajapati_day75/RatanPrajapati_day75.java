import java.util.Scanner;

public class RatanPrajapati_day75 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            if (N % K == 0) {
                System.out.println(N / K);
            } else {
                System.out.println(-1);
            }
        }
    }
}