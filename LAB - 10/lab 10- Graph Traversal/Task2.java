public class Task2 {
    public static void main(String[] args) {

        int [][] adj_mat = {{0, 0, 0, 0, 0, 0, 0},
                            {1, 0, 0, 0, 0, 0, 0},
                            {0, 1, 0, 0, 0, 0, 0},
                            {0, 1, 1, 0, 0, 1, 0},
                            {1, 0, 0, 1, 1, 0, 0},
                            {1, 0, 0, 0, 1, 0, 0},
                            {0, 0, 1, 0, 1, 0, 0}
                           };

        int ver_num = adj_mat.length;
        int start = 6;

        System.out.println("DFS Traversal Order: ");

        Graph_traversal(adj_mat, start, ver_num);                   

    }

    public static void Graph_traversal(int[][] adj_mat, int start, int ver_num)
    {
        boolean[] visited = new boolean[ver_num];
        Stack stack = new Stack();

        stack.push(start);

        while (!stack.isEmpty()) 
        {
            int curr = (int) stack.pop();

            if (visited[curr] == false)
            {
                visited[curr] = true;
                System.out.print(curr + " ");

                int len = adj_mat[curr].length;
                for (int i=0; i<len; i++)
                {
                    if (adj_mat[curr][i] != 0)
                    stack.push(i);
                }
            }
            
        }



    } 
}


