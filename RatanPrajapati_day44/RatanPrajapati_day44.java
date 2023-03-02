import java.util.Scanner;

public class RatanPrajapati_day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int odd = 0, even = 0;
        System.out.println("Enter the elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                even++; 
            } else {
                odd++;
            }
        }
        System.out.println("Number of even elements :\n" + even + "\nNumber of odd elements :\n" + odd);
    }
}
