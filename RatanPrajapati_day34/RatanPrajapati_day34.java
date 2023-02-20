import java.util.Scanner;

public class RatanPrajapati_day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String st2 = "";
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '(' || st.charAt(i) == ')') {
                st2 += "";
            } else {
                st2 += st.charAt(i);
            }
        }
        System.out.println(st2);
    }
}