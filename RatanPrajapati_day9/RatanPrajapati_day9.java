import java.util.Scanner;

public class RatanPrajapati_day9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numb = sc.nextInt();
        int sum = 0;
        while (numb != 0) {
            numb = numb / 10;
            sum++;
        }
        System.out.println(sum);
    }
}