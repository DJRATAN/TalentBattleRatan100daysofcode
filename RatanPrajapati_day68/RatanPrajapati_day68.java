import java.util.LinkedList;
import java.util.Scanner;

public class RatanPrajapati_day68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        LinkedList<Integer> arr = new LinkedList<Integer>();
        while (T-- > 0) {
            int index = sc.nextInt();
            int value = sc.nextInt();
            switch (index) {
                case 1:
                    arr.add(value);
                    break;
                case 2:
                    if (arr.contains(value)) {
                        arr.remove(arr.indexOf(value));
                    }
                    break;
                case 3:
                    if (arr.contains(value)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                    break;
            }
        }
    }
}