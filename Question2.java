import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius of circle");
        double Radius = sc.nextDouble();

        double Circumference = 2 * Math.PI * Radius;
        System.out.println("Circumference of circle = "+ Circumference);

        double Area = Math.PI * (Radius * Radius) ;
        System.out.println("Area of circle = " + Area);


    }

} 