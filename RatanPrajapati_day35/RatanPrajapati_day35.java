import java.util.Scanner;

public class RatanPrajapati_day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int st2 = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) >= '1' && st.charAt(i) <= '9') {
                st2 += st.charAt(i) - '0';
            }
        }
        System.out.println(st2);
    }
}
