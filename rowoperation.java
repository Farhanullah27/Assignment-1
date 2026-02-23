public class rowoperation {
    public static void main(String[] args) {
         double [][] matrix = {
            {1, 0, 5, 1, 0, 0 } , 
            {9, 6, 4, 0, 1, 0}  ,
            {2, 8, 2, 0, 0, 1} };

            for ( int j = 0 ; j <6 ; j++) {
                matrix[2][j] = matrix[2][j] / 2.0 ; }

            for ( int j = 0 ; j <6 ; j++) {
                matrix[2][j] = matrix[2][j] - matrix[0][j] ; }
             
            for ( int j = 0 ; j <6 ; j++) {
                matrix[1][j] = matrix[1][j] - 9.0*matrix[0][j] ; } 
                
            for ( int j = 0 ; j <6 ; j++) {
                matrix[2][j] = matrix[2][j] / 4.0 ; }

            for ( int j = 0 ; j <6 ; j++) {
                matrix[1][j] = matrix[1][j] / 6.0  ; }    
             
            for ( int j = 0 ; j <6 ; j++) {
                matrix[2][j] = matrix[2][j] - matrix[1][j] ; } 
                
             for ( int j = 0 ; j <6 ; j++) {
                matrix[2][j] = matrix[2][j] * 6.0/35.0 ; } 
                
             for ( int j = 0 ; j <6 ; j++) {
                matrix[0][j] = matrix[0][j] - 5*matrix[2][j] ; }
                    
            for ( int j = 0 ; j <6 ; j++) {
                matrix[1][j] = matrix[1][j] + ( (41.0/6.0) *matrix[2][j]) ; }
            
             System.out.println("The updated matrix is : ");
            for ( int i = 0 ; i < 3 ; i++) {
                for ( int j = 0 ; j < 6 ; j++) {
                    System.out.printf("%.3f ", matrix[i][j]);
                }
                System.out.println();
            }


    }
}
