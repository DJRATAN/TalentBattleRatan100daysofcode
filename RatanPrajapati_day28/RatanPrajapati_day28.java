import java.util.Scanner;

public class RatanPrajapati_day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        for (int i = st.length() - 1; i >= 0; i--) {
            System.out.print(st.charAt(i));
        }
    }
}
