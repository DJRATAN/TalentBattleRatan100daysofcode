import java.util.Arrays;
import java.util.Scanner;

public class RatanPrajapati_day52 {
    static void swap(int arr[], int start, int end) {
        arr[start] = arr[start] ^ arr[end];
        arr[end] = arr[start] ^ arr[end];
        arr[start] = arr[start] ^ arr[end];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int vec1[] = new int[n];
        for (int i = 0; i < n; i++) {
            vec1[i] = sc.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            swap(vec1, i, n - i - 1);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(vec1[i] + " ");
        }
    }
}
