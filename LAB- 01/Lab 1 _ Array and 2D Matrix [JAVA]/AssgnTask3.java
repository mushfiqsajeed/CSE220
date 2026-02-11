//Assignment Task 03: Matrix Compression
class AssgnTask3{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer[][] compressMatrix( Integer[][] matrix ){

        //For this task you'll need to create new 2D array
        
        int row = matrix.length;
        int col = matrix[0].length;

        Integer[][] new_arr = new Integer[row/2][col/2];
        // int inn_len = new_arr.length;

        int indx_r = 0;
        int indx_c = 0;
        
        for (int r=0; r<row; r+=2)
        {
            indx_c = 0;
            for (int c=0; c<col; c+=2)
            {
                new_arr[indx_r][indx_c++] = matrix[r][c] + matrix[r][c+1] + matrix[r+1][c] + matrix[r+1][c+1];                  
            }
            indx_r++;
        }
        return new_arr;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}