import java.util.Scanner;

public class RatanPrajapati_day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = num % 2;
        if(num == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    } 
}
