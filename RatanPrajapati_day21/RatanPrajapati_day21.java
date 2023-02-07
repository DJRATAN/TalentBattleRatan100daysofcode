import java.util.Scanner;

public class RatanPrajapati_day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0, rem = 0;
        while(temp > 0) {
            rem = temp %10;
            temp /= 10;
            sum = (sum * 10)+rem;
        }
        if(sum == num){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not  a Palindrome");
        }
    }
}