public class practise_220 {
    public static void main(String[] args) {

        int[] arr = {1, 11, 12, 33, 44, 55, 66, 77, 88, 99};
        int high = arr.length-1;
        int low = 0;

        int x = 77;

        while (high>=low)
        {
            int mid = (high+low)/2;
            if (arr[mid] == x)
            {
                System.out.println("FOUND AT" + mid + " index.");
                break;
            }
            else if (arr[mid] < x)
            {
                low = mid+1;
            }
            else high = mid-1;
        }

    }
}