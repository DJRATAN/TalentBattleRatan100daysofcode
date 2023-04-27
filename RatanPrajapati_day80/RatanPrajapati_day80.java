import java.util.Scanner;
import java.util.HashMap;

public class RatanPrajapati_day80 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                hm.put(k, hm.getOrDefault(k, 0) + 1);
            }
            boolean isTrue = true;
            for (Integer i : hm.keySet()) {
                if (hm.get(i) % 2 != 0) {
                    isTrue = false;
                }
            }
            if (isTrue) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}