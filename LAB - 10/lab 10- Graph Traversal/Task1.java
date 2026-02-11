public class Task1 {
    public static void main(String[] args){

        int [][] adj_mat = {{0, 5, 0, 0, 0, 0, 0},
                            {5, 0, 0, 0, 0, 0, 0},
                            {0, 3, 0, 0, 0, 0, 0},
                            {0, 6, 4, 0, 0, 0, 0},
                            {7, 0, 0, 2, 7, 0, 0},
                            {11, 0, 0, 9, 10, 0, 0},
                            {0, 0, 8, 0, 11, 0, 0}
                           };
        int ver_num = adj_mat.length; 
        int start = 6;

        System.out.println("BFS Traversal Order: ");

        Graph_traversal(adj_mat, start, ver_num);                   

    }

    public static void Graph_traversal(int[][] adj_mat, int start, int ver_num)
    {
        LinkedListQueue queue = new LinkedListQueue();
        boolean[] visited = new boolean[ver_num];

        queue.enqueue(start);

        while(!queue.isEmpty())
        {
            int curr = (int) queue.dequeue();
            System.out.print(curr + " ");
            visited[curr] = true;

            int len = adj_mat[curr].length;
            
            for (int i=0; i<len; i++)
            {
                if (adj_mat[curr][i] != 0)
                {
                    if (visited[i] == false)
                    {
                        queue.enqueue(i);
                        visited[i] = true;
                    }
                }
            }
        }



    }
    
}
