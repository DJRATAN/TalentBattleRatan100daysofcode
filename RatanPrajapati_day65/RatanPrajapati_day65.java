import java.util.Scanner;

public class RatanPrajapati_day65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int B = sc.nextInt();
            int ans = 0;
            for(int i = 0; i < N; i++) {
                int Wi = sc.nextInt();
                int Hi = sc.nextInt();
                int Pi = sc.nextInt();
                if(Pi<=B){
                    ans = Math.max((Wi*Hi),ans);
                }
            }
            if(ans !=0){
                System.out.println(ans);
            }else{
                System.out.println("no tablet");
            } 
        }
    }
}