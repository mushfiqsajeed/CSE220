public class Task4a {
    public static void main(String[] args) {

    //Task4a
    //                   M  U  S  H  F  I  Q  C  X  E
    int[][] adj_mat = { {0, 1, 0, 0, 0, 0, 0, 9, 0, 0}, 
                        {0, 0, 0, 0, 2, 0, 0, 0, 0, 0}, 
                        {7, 0, 0, 0, 0, 0, 0, 8, 0, 0}, 
                        {0, 0, 0, 0, 0, 0, 0, 0, 14, 11}, 
                        {0, 0, 0, 0, 0, 0, 3, 0, 0, 0}, 
                        {0, 0, 6, 0, 0, 0, 0, 13, 0, 0}, 
                        {0, 0, 0, 0, 0, 0, 0, 0, 4, 166}, 
                        {0, 0, 0, 10, 0, 0, 0, 0, 0, 0}, 
                        {0, 0, 0, 0, 0, 5, 0, 0, 0, 0}, 
                        {0, 15, 0, 0, 12, 0, 0, 0, 0, 0}
                        };

    String[] vertices = {"M", "U", "S", "H", "F", "I", "Q", "C", "X", "E"};

    System.out.println("---Adjacency Matrix---");
    convertToUndirected(adj_mat);
    
    System.out.println("---Converted to undirected weighted graph---");
    printConvertedGraph(adj_mat, vertices);

    }

    public static void convertToUndirected(int[][] adj_mat)
    {
        int row = adj_mat.length;
        int col = adj_mat[0].length;
    
        for (int r=0; r<row; r++)
        {
            for (int c=0; c<col; c++)
            {
                if(adj_mat[r][c] != 0)
                {
                    if(adj_mat[c][r] == 0)
                    adj_mat[c][r] = adj_mat[r][c];
                }
            }
        }

    }

    public static void printConvertedGraph(int[][] adj_mat, String[] vertices) {
        int row = adj_mat.length;
        int col = adj_mat[0].length; 

        System.out.print( "  ");
        for(String x : vertices)
        {
            System.out.print(x + " ");
        }
        System.out.println();

        for(int r = 0; r < row; r++) 
        { 
            System.out.print(vertices[r] + " ");
            for(int c = 0; c < col; c++) {
                System.out.print(adj_mat[r][c]+" ");
            }
            System.out.println();
        }
    }

}
