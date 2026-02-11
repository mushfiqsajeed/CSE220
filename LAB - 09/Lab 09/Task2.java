public class Task2 {
    public static void main(String[] args) {

        //Task2a
        //                   M  U  S  H  F  I  Q
        int[][] adj_mat = { {0, 1, 9, 0, 6, 8, 0},
                            {1, 0, 0, 14, 7, 13, 2},
                            {9, 0, 0, 4, 5, 11, 15},
                            {0, 14, 4, 0, 0, 16, 3},
                            {6, 7, 5, 0, 0, 10, 0},
                            {8, 13, 11, 16, 10, 0, 420},
                            {0, 2, 15, 3, 0, 420, 0}
                            };

        String[] vertices = {"M", "U", "S", "H", "F", "I", "Q"};

        int max_weight_vertex = adj_matrix(adj_mat);
        System.out.println("The vetex whose sum of weights is maximum-->" + vertices[max_weight_vertex]);

        //Task2b
        int len = vertices.length;
        Edge[] adj_list = new Edge[len];

        for (int r=0; r<len; r++)
        {
            for (int c=r; c<len; c++)
            {
                if (adj_mat[r][c] != 0)
                add_Edge(adj_list, r, c, adj_mat[r][c]);
            }
        }

        int max_vertex_index = maxVertex(adj_list);
        System.out.println("The vetex whose sum of weights is maximum in the adjacency list-->" + vertices[max_vertex_index]);    

    }

    //Task2a
    public static int adj_matrix(int[][] adj_matrix)
    {
        int max_index = 0;

        int max_sum = 0;

        int row = adj_matrix.length;
        int col = adj_matrix[0].length;

        for(int r=0; r < row; r++)
        {
            int curr_Sum = 0;

            for(int c=0; c < col; c++)
            {
                curr_Sum += adj_matrix[r][c];
            }

            if (curr_Sum > max_sum)
            {
                max_sum = curr_Sum;
                max_index = r;
            }
        }
        return max_index;
    }

    //Task2b
    public static void add_Edge(Edge[] adj_list, int froM, int des, int weighT)
    {
        Edge newEdGe = new Edge(des, weighT);
        
        if (adj_list[froM] == null)
        adj_list[froM] = newEdGe;

        else 
        {
            Edge curr = adj_list[froM];

            while (curr.next != null)
            {
                curr = curr.next;
            }
            curr.next = newEdGe;
        }

        //Rev Node
        if (froM != des)
        {
            Edge RevEdGe = new Edge(froM, weighT);

            if (adj_list[des] == null)
            adj_list[des] = RevEdGe;

            else 
            {
                Edge curr_rev = adj_list[des];

                while (curr_rev.next != null)
                {
                    curr_rev = curr_rev.next;
                }
                curr_rev.next = RevEdGe;
            }
        }
    }

    public static int maxVertex(Edge[] adj_list)
    {
        int max_vertex_index = 0;

        int max_sum = 0;

        int row = adj_list.length;

        for (int r=0; r<row; r++)
        {
            int curr_sum = 0;
            Edge curr = adj_list[r];
            
            while (curr != null) 
            {
                curr_sum += curr.weight;
                curr = curr.next;    
            }

            if (curr_sum > max_sum)
            {
                max_sum = curr_sum;
                max_vertex_index = r;
            }
        }
        return max_vertex_index;
    }

}
