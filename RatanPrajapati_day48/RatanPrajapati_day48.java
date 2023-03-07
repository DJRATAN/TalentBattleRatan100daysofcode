import java.util.Scanner;

public class RatanPrajapati_day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < size; j++) {
            for (int i = j + 1; i < size; i++) {
                int a = arr[j] ^ arr[i];
                if (a == 0) {
                    arr[i] = 0;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}