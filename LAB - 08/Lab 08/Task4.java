public class Task4 {

    public static int[] k_largest (int[] nums, int k)
    {
        int len = nums.length;
        MaxHeap obj = new MaxHeap(len+1);

        int[] output_arr = new int[k];

        for(int i=0; i<len; i++)
        {
            obj.insert(nums[i]);
        }

        for(int i=0; i<k; i++)
        {
            int temp = obj.extractMax();
            output_arr[i] = temp;
        }
        
        return output_arr;
    }
    public static void main(String[] args) {

        int[] nums = {4, 10, 2, 8, 6, 7};
        int k = 3;

        int[] output_arr = k_largest(nums, k);

        for(int i=0; i<k; i++)
        {
            if(i== (k-1))
            System.out.print(output_arr[i]);

            else
            System.out.print(output_arr[i] + ", ");
        }
    }
}
