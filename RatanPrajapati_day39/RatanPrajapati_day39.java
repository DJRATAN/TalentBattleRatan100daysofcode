import java.util.Scanner;

public class RatanPrajapati_day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();
        boolean is = true;
        int[] al = new int[256];
        int[] bl = new int[256];
        for (char c : st1.toCharArray()) {
            int index = (int) c;
            al[index]++;
        }
        for (char c : st2.toCharArray()) {
            int index = (int) c;
            bl[index]++;
        }
        for (int i = 0; i < 256; i++) {
            if (al[i] != bl[i]) {
                is = false;
                break;
            }
        }
        if (is) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
