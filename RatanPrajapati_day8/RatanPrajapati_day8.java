import java.util.Scanner;
import java.lang.Math;

public class RatanPrajapati_day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a, b and c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double root1 = 0, root2 = 0;
        double descriminant = b * b - 4 * a * c;
        if (descriminant < 0) {
            System.out.println("Roots are Imaginary");
        } else if (descriminant > 0) {
            root1 = ((-b) - Math.sqrt(descriminant)) / (2 * a);
            root2 = ((-b) + Math.sqrt(descriminant)) / (2 * a);
            System.out.printf("Roots are Real\nRoot 1 = %,.2f", root1);
            System.out.printf(" Root 2 = %,.2f", root2);
        } else {
            root1 = (-b) / (2 * a);
            System.out.println("Roots are equal\n" + "Root 1 = root 2 = " + root1);
        }
    }
}
