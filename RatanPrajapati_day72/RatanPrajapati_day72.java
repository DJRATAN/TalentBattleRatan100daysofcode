import java.util.Scanner;

public class RatanPrajapati_day72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuffer str = new StringBuffer("");
        char ch;
        int index;
        String st;
        while (T-- > 0) {
            ch = sc.next().charAt(0);
            index = sc.nextInt();
            st = sc.next();
            if (ch == '+') {
                str.insert(index, st);
            }
            if (ch == '?') {
                System.out.println(str.substring(index - 1, Integer.parseInt(st)));
            }

        }
    }
} 