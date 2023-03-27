import java.util.Scanner;

public class RatanPrajapati_day66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String A = sc.next();
            String B = sc.next();
            int count = 0;
            for (int i = 0; i < A.length(); i++) {
                for (int j = 0; j < B.length(); j++) {
                    if (A.charAt(i) == B.charAt(j)) {
                        count = 1;
                        break;
                    }
                }
                if (count == 1) {
                    break;
                }
            }
            if (count == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}