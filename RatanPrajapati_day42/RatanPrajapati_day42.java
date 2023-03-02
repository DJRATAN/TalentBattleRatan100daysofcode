import java.util.Scanner;

public class RatanPrajapati_day42 {
    public static boolean arrayFun(int[] array1, int[] array2, int size1, int size2) {
        if (size1 != size2) {
            return false;
        }
        for (int i = 0; i < size1; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of first array :");
        int array1_size = sc.nextInt();
        System.out.println("Enter the size of second array :");
        int array2_size = sc.nextInt();
        int[] array1 = new int[array1_size];
        int[] array2 = new int[array2_size];
        System.out.println("Enter elements of first array :");
        for (int i = 0; i < array1_size; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of second array :");
        for (int i = 0; i < array2_size; i++) {
            array2[i] = sc.nextInt();
        }

        if (arrayFun(array1, array2, array1_size, array2_size)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    }
}
