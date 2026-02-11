public class Task3 
{
    public static void main(String[] args) {

    //Task3a
    //                   M  U  S  H   F  I  Q
    int[][] adj_mat = { {0, 1, 0, 0, 11, 0, 0}, 
                        {99, 0, 0, 0, 0, 12, 2}, 
                        {0, 0, 0, 10, 5, 0, 0}, 
                        {0, 0, 4, 0, 0, 166, 13}, 
                        {6, 0, 14, 0, 0, 420, 0}, 
                        {15, 0, 0, 0, 0, 0, 77}, 
                        {0, 0, 0, 3, 0, 0, 0, }
                        };

    String[] vertices = {"M", "U", "S", "H", "F", "I", "Q"};

    System.out.println("---Adjacency Matrix---");

    int max_degree = max_degree(adj_mat);
    System.out.println("Maximum out degree of this graph-->" + max_degree);

    int vertex_max_weight = vertex_max_weight(adj_mat);
    System.out.println("The vetex whose sum of weights is maximum in the adjacency matrix--> " + vertices[vertex_max_weight]);

    //Task3b
    System.out.println("---Adjacency List---");

    int len = vertices.length;
    Edge[] adj_list = new Edge[len];

        for (int r=0; r<len; r++)
        {
            for (int c=0; c<len; c++)
            {
                if (adj_mat[r][c] != 0)
                add_Edge(adj_list, r, c, adj_mat[r][c]);
            }
        }
      
    int max_deg = max_degree_adjList(adj_list);
    System.out.println("Maximum out degree of this graph-->" + max_deg);

    int max_weight_vertex = vertex_max_weight_adjList(adj_list);
    System.out.println("The vetex whose sum of weights is maximum in the adjacency list--> " + vertices[max_weight_vertex]);

    }

    //Task3a
    public static int max_degree(int[][] adj_matt)
    {
        int max_deG = 0;

        int row = adj_matt.length;
        int col = adj_matt[0].length;

        for(int r=0; r < row; r++)
        {
            int curr_maxD = 0;

            for(int c=0; c < col; c++)
            {
                if (adj_matt[r][c] != 0)
                curr_maxD++;         
            }

            if (curr_maxD > max_deG)
            max_deG = curr_maxD;
        }
        return max_deG;
    }

    public static int vertex_max_weight(int[][] matt)
    {
        int max_index = 0;

        int max_sum = 0;

        int row = matt.length;
        int col = matt[0].length;

        for(int r=0; r < row; r++)
        {
            int curr_Sum = 0;

            for(int c=0; c < col; c++)
            {
                curr_Sum += matt[r][c];
            }

            if (curr_Sum > max_sum)
            {
                max_sum = curr_Sum;
                max_index = r;
            }
        }
        return max_index;

    }

    //Task3b

    public static int max_degree_adjList(Edge[] adj_list)
    {
        int max_deG = 0;

        int len = adj_list.length;

        for (int i=0; i< len; i++)
        {
            int curr_max_deg = 0;
            Edge curr = adj_list[i];

            while (curr != null)
            {
                curr_max_deg++;
                curr = curr.next;
            }

            if (curr_max_deg > max_deG)
            max_deG = curr_max_deg;
        }
        return max_deG;
    }

    public static int vertex_max_weight_adjList(Edge[] adj_list)
    {
        int max_weight = 0;

        int max_W_index = 0;

        int len = adj_list.length;

        for (int i=0; i< len; i++)
        {
            int curr_max_deg = 0;
            Edge curr = adj_list[i];

            while (curr != null)
            {
                curr_max_deg += curr.weight;
                curr = curr.next;
            }

            if (curr_max_deg > max_weight)
            {
                max_weight = curr_max_deg;
                max_W_index = i;
            }
        }
        return max_W_index;
    }


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
    }


}
