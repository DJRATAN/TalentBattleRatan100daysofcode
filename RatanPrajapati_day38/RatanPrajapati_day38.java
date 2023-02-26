import java.util.Scanner;

public class RatanPrajapati_day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char[] ch = st.toCharArray();
        int[] count = new int[st.length()];
        for (int i = 0; i < st.length(); i++) {
            count[i] = 1;
            for (int j = i + 1; j < st.length(); j++) {
                if (ch[i] == ch[j]) {
                    count[i]++;
                    ch[j] = '0';
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (ch[i] != ' ' && ch[i] != '0')
            if(count[i] == 1){
                System.out.print(ch[i]+" ");
            }
        }
    }
}
