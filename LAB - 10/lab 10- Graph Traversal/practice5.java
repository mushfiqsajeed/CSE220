public class practice5 {
    public static void main(String[] args) {

        int[][] adj_mat = { {0, 1, 0, 0, 6, 10}, 
                            {0, 0, 0, 2, 0, 0}, 
                            {4, 0, 0, 0, 5, 0}, 
                            {0, 0, 3, 0, 0, 8}, 
                            {0, 0, 0, 0, 0, 7}, 
                            {0, 9, 0, 0, 0, 0}
                          };
        int len = adj_mat.length;
        edge[] adj_List = new edge[len];

        for (int r=0; r<len; r++)
        {
            for (int c=0; c<len; c++)
            {
                addEdge(adj_List, r, c, adj_mat[r][c]);
            }
        }
        max_vertex_sum(adj_List);

    }

    public static void max_vertex_sum(edge[] adj_List)
    {
        int max_sum = 0;

        int max_ver = 0;

        int len = adj_List.length;

        for (int i=0; i<len; i++)
        {
            edge curr = adj_List[i];
            int curr_sum = 0;

            while (curr != null) 
            {
                curr_sum += curr.weight;
                curr = curr.next;    
            }

            if (max_sum < curr_sum)
            {
                max_sum = curr_sum;
                max_ver = i;
            }
        }
        System.out.println("Vertex=" + max_ver);
        System.out.println("sum=" + max_sum);
    }
    
    public static void addEdge(edge[] adj_List, Integer from, Integer to, int weight)
    {
        edge newEdge = new edge(to, weight);

        if (adj_List[from] == null)
        adj_List[from] = newEdge;

        else
        {
            edge curr = adj_List[from];

            while (curr.next != null) 
            {
                curr = curr.next;    
            }
            curr.next = newEdge;
        }
    }
}
