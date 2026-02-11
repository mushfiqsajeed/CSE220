import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {
        int[][] arr = { {0, 5, 10, 7},
                        {2, 0, 14, 13},
                        {8, 4, 0, 9},
                        {3, 6, 1, 0}
                      };
        int n = arr.length;

        System.out.print("Output-->" + Arrays.toString(calculate_net_spend(arr, n)));

    }

    public static int[] calculate_net_spend(int[][] M, int n)
    {
        int[] out_arr = new int[n];

        for (int r=0; r<n; r++)
        {
            int out = 0;
            int in = 0;
            for (int c=0; c<n; c++)
            {
                out += M[r][c];
                in += M[c][r];
            }
            out_arr[r] = (out - in);
        }
        return out_arr;
    }
    
}
