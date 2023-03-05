import java.util.Scanner;

public class RatanPrajapati_day47 {
    public static boolean palindrom(int n) {
        int temp = n;
        int a = 0, sum = 0;
        while (n > 0) {
            a = n % 10;
            sum = sum * 10 + a;
            n /= 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int maxNum = Integer.MIN_VALUE;
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (palindrom(arr[i])) {
                maxNum = Math.max(maxNum, arr[i]);
            }
        }
        if (palindrom(maxNum)) {
            System.out.println(maxNum);
        } else {
            System.out.println("Palindrom is not there in the Array");
        }
    }
}