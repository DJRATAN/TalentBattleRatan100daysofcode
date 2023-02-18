import java.util.Scanner;

public class RatanPrajapati_day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String st2 = "";
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o'
                    || st.charAt(i) == 'u' || st.charAt(i) == 'A' || st.charAt(i) == 'E' || st.charAt(i) == 'I'
                    || st.charAt(i) == 'O' || st.charAt(i) == 'U') {
                st2 += "";
            } else {
                st2 += st.charAt(i);
            }
        }
        System.out.println(st2);
    }
}