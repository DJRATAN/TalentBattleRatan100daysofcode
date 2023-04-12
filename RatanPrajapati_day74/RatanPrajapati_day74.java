import java.util.Scanner;

public class RatanPrajapati_day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int ans = 0;
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (M % 2 == 0 && N % 2 == 0) {
                ans = 0;
            } else if (M % 2 == 0 && N % 2 != 0) {
                ans = M;
            } else if (M % 2 != 0 && N % 2 == 0) {
                ans = N;
            } else {
                ans = M + N - 1;
            }
            System.out.println(ans);
        }
    }
}