import java.util.Scanner;

public class RatanPrajapati_day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String st2 = "";
        for (int i = 0; i < st.length(); i++) {
            if (i == 0 || i == st.length() - 1) {
                st2 += (char) (st.charAt(i) - 32);
            } else {
                st2 += st.charAt(i);
            }
        }
        System.out.println(st2);
    }
}
