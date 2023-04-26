import java.util.Scanner;

public class RatanPrajapati_day79 {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int size = sc.nextInt();
            String st = sc.next();
            int count = 0, t = 0;
            for (int i = 0; i < size - 1; i++) {
                if (st.charAt(i) == '1') {
                    count++;
                    if (st.charAt(i) == st.charAt(i + 1)) {
                        t++;
                    }
                }
            }
            if (st.charAt(size - 1) == '1' && count == 0) {
                System.out.println('1');
                continue;
            }
            if (count == 0) {
                System.out.println(count);
            } else {
                if (t == 0) {
                    System.out.println('1');
                } else {
                    System.out.println('2');
                }
            }
        }
    }
}
