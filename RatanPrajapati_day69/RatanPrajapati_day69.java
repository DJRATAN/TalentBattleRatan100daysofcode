class isosceles{
    public void isoscelesPrint(){
        System.out.println("I am an equilateral triangle");
    }
}
class Equilateral extends isosceles {
    public void EquilateralPrint (){
        System.out.println("I am an isosceles triangle I am a triangle");
    }
}
public class RatanPrajapati_day69 extends Equilateral {
    public static void main(String[] args) {
        RatanPrajapati_day69 C = new RatanPrajapati_day69();
        C.isoscelesPrint();
        C.EquilateralPrint();
    }
}