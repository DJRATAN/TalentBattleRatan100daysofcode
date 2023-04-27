import java.util.Scanner;

public class RatanPrajapati_day81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            String st = sc.next();
            int ans = 0;
            for (int i = n - 2; i >= 0; i--) {
                if (st.charAt(i) == '1' && st.charAt(i + 1) == '0') {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
