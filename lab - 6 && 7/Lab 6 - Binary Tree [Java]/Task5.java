// Complete the subtractSummation method
//ASSIGNMENT TASK MUST SUBMIT
public class Task5 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer subtractSummation( BTNode root ){
        //TO DO
        Integer sum_left = sumInteger(root.left);
        Integer sum_right = sumInteger(root.right);

        Integer sum = sum_left - sum_right;

        return sum; //remove this line
    }

    private static Integer sumInteger (BTNode root)
    {
        Integer sum = 0;

        if (root == null)
        return 0;

        else
        sum = (Integer) root.elem;

        sum += sumInteger(root.left);
        sum += sumInteger(root.right);

        return sum;
    }
    //============================================================================

}
