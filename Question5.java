import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Voltage ");
        double Voltage  = sc.nextDouble();
        System.out.println("Enter Current in Ampere");
        double Ampere = sc.nextDouble();

        double Watt = Voltage * Ampere ;
        System.out.println("Watt = " + Watt);
    }
    
}
