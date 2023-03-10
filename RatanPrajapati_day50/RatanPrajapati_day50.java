import java.util.Scanner;

public class RatanPrajapati_day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += Math.pow(arr[i], 2);
        }
        System.out.println(sum);
    }
}