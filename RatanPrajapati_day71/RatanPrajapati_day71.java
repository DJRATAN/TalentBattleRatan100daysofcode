import java.util.Arrays;
import java.util.Scanner;

public class RatanPrajapati_day71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            solve(arr, N);
        }
    }
    public static void solve(int[] arr, int N) {
        Arrays.sort(arr);
        int cnt = N / 2;
        while (cnt > 0 && arr[cnt - 1] == arr[cnt]) {
            cnt--;
        }
        System.out.println(N - cnt);
    }
}