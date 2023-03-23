import java.util.Scanner;

public class RatanPrajapati_day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String st = sc.next();
            if ((st.contains("010")) || (st.contains("101"))) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
    }
}