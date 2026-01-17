import java.util.Scanner;

public class Question4 {
  
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Discounted selling  Price");
        double Selling_Price  = sc.nextDouble();
        System.out.println("Enter Discounted Percntage");
        double Discount_Percentage = sc.nextDouble();

        double Original_Price = Selling_Price/(1-Discount_Percentage/100);
        System.out.println("Original Price = " + Original_Price);
    }
}
