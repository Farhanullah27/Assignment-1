import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Integer");
        int Integer = sc.nextInt();

        if (Integer % 2 == 0) {

        System.out.println( "Even");       

        } else {
            
            System.out.println("Odd");
        }
    }
    
}
