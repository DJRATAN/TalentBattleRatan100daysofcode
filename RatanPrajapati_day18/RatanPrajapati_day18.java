import java.util.Scanner;

public class RatanPrajapati_day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = (x1 * y2) + (x2 * y1);
        int y3 = (y1 * y2);
        System.out.println(x3 + "/" + y3);

    }
}
