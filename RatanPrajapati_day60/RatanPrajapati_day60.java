import java.util.Scanner;

public class RatanPrajapati_day60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int sunny_day = 0, rainy_day = 0;
            int A[] = new int[7];
            for (int i = 0; i < 7; i++) {
                A[i] = sc.nextInt();
                if (A[i] == 1) {
                    sunny_day++;
                }
                if (A[i] == 0) {
                    rainy_day++;
                }
            }
            if (sunny_day > rainy_day) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
