import java.lang.foreign.Arena;
import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of side a ");
        double a  = sc.nextDouble();
        System.out.println("Enter the value of side b");
        double b = sc.nextDouble();
        System.out.println("Enter the value of side c ");
        double c = sc.nextDouble();

        double  s = (a+b+c)/2;
        double Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of Triangle  = " + Area );

    }
    
}
