import java.util.Scanner;

public class RatanPrajapati_day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String st1 = sc.nextLine();
        System.out.println("Enter the substring to be removed :");
        String st2 = sc.nextLine();
        System.out.println("Enter the new substring :");
        String st3 = sc.nextLine();
        String newStr = st1.replace(st2, st3);
        System.out.println("The new string :" + newStr);
    }
} 