import java.util.Scanner;

public class RatanPrajapati_day70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int last = arr[N - 1];
        for (int j = N - 1; j > 0; j--) {
            arr[j] = arr[j - 1];
        }
        arr[0] = last;
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}