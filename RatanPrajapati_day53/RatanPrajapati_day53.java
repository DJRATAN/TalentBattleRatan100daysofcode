import java.util.Scanner;

public class RatanPrajapati_day53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = arr[0];
        for (int i = 0; i < size; i++) {
            int prod = arr[i];
            for (int j = i + 1; j < size; j++) {
                ans = Math.max(ans, prod);
                prod = prod * arr[j];
            }
            ans = Math.max(ans, prod);
        }
        System.out.println(ans);
    }
} 