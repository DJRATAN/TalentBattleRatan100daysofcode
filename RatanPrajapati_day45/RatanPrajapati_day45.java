import java.util.Scanner;

public class RatanPrajapati_day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int minNum=Integer.MAX_VALUE;
        int maxNum=Integer.MIN_VALUE;
        System.out.println("Enter the elements :");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
            minNum = Math.min(arr[i], minNum);
            maxNum = Math.max(arr[i], maxNum);
        }
        System.out.println("Smallest Number :\n"+minNum+"\nLargest Number :\n"+maxNum);
    }
}
