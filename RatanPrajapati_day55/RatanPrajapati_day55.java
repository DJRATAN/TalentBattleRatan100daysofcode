import java.util.Arrays;
import java.util.Scanner;

public class RatanPrajapati_day55 {
    static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int vec1[] = new int[n];
        for (int i = 0; i < n; i++) {
            vec1[i] = sc.nextInt();
        }
        int vec2[] = new int[n];
        for (int i = 0; i < n; i++) {
            vec2[i] = sc.nextInt();
        }
        Arrays.sort(vec1);
        Arrays.sort(vec2);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vec1[i] * vec2[i];
        }
        System.out.println(sum);

    }
}
