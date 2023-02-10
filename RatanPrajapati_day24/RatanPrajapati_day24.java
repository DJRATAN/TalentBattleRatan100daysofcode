import java.util.Scanner;

public class RatanPrajapati_day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        pramidPattern(num);
    }

    public static void pramidPattern(int num) {
        int i, j, k, s;
        for (i = 0; i < num; i++) {
            for (j = 0; j < num - i; j++) {
                System.out.print("  ");
            }
            for (k = j; k <= num; k++) {
                System.out.print("* ");
            }
            for (s = j; s < num; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
