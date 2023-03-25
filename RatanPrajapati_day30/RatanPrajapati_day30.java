import java.util.Scanner;

public class RatanPrajapati_day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
} 