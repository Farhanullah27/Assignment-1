import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Original Price");
        double Original_Price  = sc.nextDouble();
        System.out.println("Enter Discounted Percntage");
        double Discount_Percentage = sc.nextDouble();

        double Discount_price = Original_Price*Discount_Percentage/100;
        double Selling_price = Original_Price - Discount_price ;
        System.out.println("Selling Price = " + Selling_price);
        
    }
}
