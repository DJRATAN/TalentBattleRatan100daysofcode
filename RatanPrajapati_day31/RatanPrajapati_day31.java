
import java.util.Scanner;

public class RatanPrajapati_day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String temp = "";
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            int num = ch;
            if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
                num = num - 32;
            } else if (st.charAt(i) >= 'A' && st.charAt(i) <= 'Z') {
                num = num + 32;
            } else {
                System.out.println("Enter only Alphabetical characters");
            }
            ch = (char) num;
            temp += ch;
        }
        System.out.println(temp);
    }
}
