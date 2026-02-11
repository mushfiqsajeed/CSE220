public class task3 {

    public static int[] minHeap_Operation(int[] arr, int m)
    {
        MinHeap obj = new MinHeap(m+1);
        
        int len = arr.length;

        for (int i=0; i<m; i++)
        {
            obj.insert(0);
        }

        for (int i=0; i<len; i++)
        {
            int temp = obj.extractMin();
            obj.insert(temp + arr[i]);
        }

        int[] x = obj.getArray();
        return x;
    }
    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 1, 6};
        int m = 4;

        int[] x = minHeap_Operation(arr, m);

        int size = x.length;

        System.out.println("Output--->");
        for (int i=1; i<size; i++)
        {
            if(i == (size-1))
            System.out.print(x[i]);

            else
            System.out.print(x[i] + ", ");
        }
    }
}