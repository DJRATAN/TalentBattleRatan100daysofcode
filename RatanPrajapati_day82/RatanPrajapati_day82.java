import java.util.Scanner;

public class RatanPrajapati_day82 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String ans = "";
            for (int j = 0; j < n; j++) {
                String s = sc.nextLine();
                if (s.charAt(j) == '0')
                    ans += "1";
                else
                    ans += "0";
            }
            System.out.println(ans);
        }
    }
}