import java.util.Scanner;

public class RatanPrajapati_day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int odd = 0, even = 0;
        System.out.println("Enter elements ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if (even == size) {
            System.out.println("Even");
        } else if (odd == size) {
            System.out.println("Odd");
        } else {
            System.out.println("Mixed");
        }
    }
}
