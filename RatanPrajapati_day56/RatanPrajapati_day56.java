import java.util.Scanner;

public class RatanPrajapati_day56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            while (arr[i] % 2 == 0) {
                arr[i] /= 2;
            }
            while (arr[i] % 3 == 0) {
                arr[i] /= 3;
            }
        }
        boolean is = true;
        for (int i = 1; i < size; i++) {
            if (arr[0] != arr[i]) {
                is = false;
                break;
            }
        }
        if (is) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
    }
}
