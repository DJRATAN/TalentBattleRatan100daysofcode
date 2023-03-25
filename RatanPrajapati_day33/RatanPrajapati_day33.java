
import java.util.Scanner;

public class RatanPrajapati_day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String st2 = "";
        int len = st.length()-1;
        boolean is = true;
        for (int i = 0; i < len / 2; i++) {
            if (st.charAt(i) != st.charAt(len)) {
                is = false;
                break;
            }
        }
        if (is) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        } 
    }
}