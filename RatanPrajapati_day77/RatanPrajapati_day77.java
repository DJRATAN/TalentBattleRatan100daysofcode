import java.util.Arrays;
import java.util.Scanner;

public class RatanPrajapati_day77 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            Long A[] = new Long[N];
            Long ans = Long.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }
            Arrays.sort(A);
            ans = (A[N - 1] - A[0]) * A[N - 2];
            System.out.println(ans);
        }
    }
}