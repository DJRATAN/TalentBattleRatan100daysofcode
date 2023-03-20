import java.util.Scanner;

public class RatanPrajapati_day62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            ++N;
            int ans = N*Y;
            if(ans >= X){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
