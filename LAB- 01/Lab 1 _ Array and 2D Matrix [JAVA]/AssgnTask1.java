//Assignment Task 01: Container with Most Water
class AssgnTask1{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void mostWater( Integer[] height ){

        //TO DO
        int len = height.length;
        int h = 0;

        int max_area = 0;
        int area = 0;

        int i = 0;
        int j = len-1;

        while (i < j)
        {
            if (height[j] < height[i])
            {
                h = height[j];
            }
            else h = height[i];

            area = h * (j - i);

            if(max_area < area)
            {
                max_area = area;
            }
            
            if (height[j] < height[i]) j--;
            else i++;
        }
        System.out.println(max_area);
        
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
