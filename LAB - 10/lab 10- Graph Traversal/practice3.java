public class practice3 {
    public static void main(String[] args) {

        int[][] adj_mat = { {0, 1, 0, 0, 0},
                            {0, 0, 1, 0, 0},
                            {0, 0, 0, 1, 0},
                            {0, 0, 0, 0, 1},
                            {1, 0, 0, 0, 0}
                          };
        boolean x = wantToReturnStart(adj_mat);
        System.out.println("Output--> " + x);

    }
    public static boolean wantToReturnStart (int[][] arr)
    {
        int n = arr.length;
        int start = 0;
        boolean[] visited = new boolean[n];
        
        Stack stack = new Stack();
        stack.push(start);

        while (!stack.isEmpty())
        {
            int curr = (int) stack.pop();

            if (curr == start && visited[curr]==true)
            {
                return true;
            }

            if (visited[curr] == false)
            {
                visited[curr] = true;

                for (int i=0; i<n; i++)
                {
                    if(arr[curr][i] != 0)
                    stack.push(i);
                }
            }
        }
        return false;
    }
}
