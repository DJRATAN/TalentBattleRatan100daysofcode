import java.util.Scanner;

public class RatanPrajapati_day23 {
    public static int reverse(int num){
        int temp = num,rem = 0,sum = 0;
        while(temp > 0) {
            rem = temp %10;
            temp /= 10;
            sum = (sum * 10)+rem;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0,rem = 0;
        while(temp > 0) {
            rem = temp % 10;
            temp /= 10;
            if(rem == 0) {
                sum =  sum*10 + 1;
            }else{
                sum = sum*10 + rem;
            }
        }
        System.out.println(reverse(sum));
    }
}