import java.util.Scanner ;

public class matrixmultiply {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix1 = {{1, 3, 9} , {2, 4, 7}};
        int [][] matrix2 = {{1, 0, 5} , {9, 6, 4} , {2, 8, 2}};

        
    System.out.println("First matrix is : ");
        for (int i = 0 ; i < 2 ; i++) {
           for (int j = 0 ; j < 3 ; j++) {
            System.out.print(matrix1[i][j]+" ");
        }
        System.out.println();}
        
        System.out.println("Second matrix is : ");

         for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
            System.out.print(matrix2[i][j]+" ");
        }
        System.out.println();}
         
        System.out.println("The product of the two matrices is : ");
        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                int M = 0 ;
                for (int k = 0 ; k < 3 ; k++) {
                    M = M + matrix1[i][k] * matrix2[k][j] ;
                }
                System.out.print(M+" ");
            }
            System.out.println();
        }




        
    }

    
    }
