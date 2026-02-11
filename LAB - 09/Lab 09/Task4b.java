public class Task4b 
{
    public static void main(String[] args)
    {
    //Task4b
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
    System.out.println("---Adjacency List---");
    
    int len = vertices.length;
    Edge[] adj_list = new Edge[len];

    for (int r=0; r<len; r++)
    {
        for (int c=0; c<len; c++)
        {
            if (adj_mat[r][c] != 0)
            {
                add_Edge(adj_list, r, c, adj_mat[r][c]);
            }
            
        }
    }
    convertToUndirectedGrapH(adj_list, adj_mat);
    System.out.println("---Converted to undirected weighted graph---");
    showAdjList(adj_list, vertices);

    }

    public static void convertToUndirectedGrapH(Edge[] adj_list, int[][] adj_mat)
    {
        int row = adj_mat.length;
        int col = adj_mat[0].length;

        for (int r=0; r<row; r++)
        {
            for (int c=0; c<col; c++)
            {
                if (adj_mat[r][c] != 0 && r != c)
                {
                    if(adj_mat[c][r] == 0)
                    add_Edge(adj_list, c, r, adj_mat[r][c]);
                }
            
            }
        }
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

    public static void showAdjList(Edge[] adjList, String[] vertices) {
        for (int i = 0; i < adjList.length; i++) 
        {
            System.out.print("Vertex " + vertices[i] + ":");
            printLL(adjList[i], vertices);
        }
    }

    public static void printLL(Edge head, String[] vertices) {
        Edge curr = head;
        while (curr != null) {
            System.out.print(" -> (" + vertices[curr.destination] + "," + curr.weight + ")");
            curr = curr.next;
        }
        System.out.println();
    }

}
