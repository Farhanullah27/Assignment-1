import java.util.Scanner;

public class Question6 {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of first paralel side ");
        double a  = sc.nextDouble();
        System.out.println("Enter the value of second paralel side");
        double b = sc.nextDouble();
        System.out.println("Enter the value of Hight ");
        double h = sc.nextDouble();

        double  K_Area = h * (a + b)/2 ;
        System.out.println("Area of trapeziam  = " + K_Area);
    }
}
