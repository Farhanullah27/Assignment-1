import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Obtaind Marks");
        float Obtaind = sc.nextFloat();
        System.out.println("Enter Total Marks");
        float max = sc.nextFloat();

        float Percentage = (Obtaind/max)*100;
        System.out.println("Percentage = "+ Percentage);


    }

} 