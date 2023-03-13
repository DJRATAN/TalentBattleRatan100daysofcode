import java.util.Scanner;

public class RatanPrajapati_day54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        int xor = 1;
        for (int i = 0; i < size1; i++) {
            if (xor == 0) {
                break;
            }
            for (int j = 0; j < size2; j++) {
                xor = arr1[i] ^ arr2[j];
                if (xor == 0) {
                    break;
                }
            }
        }
        if (xor == 0) {
            System.out.println("Not disjoint.");
        } else {
            System.out.println("Disjoint");
        }
    }
}