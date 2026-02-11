// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        //TO DO

        Integer sum = helperMeth(root, 0);

        return sum; //remove this line
    }

    private static Integer helperMeth(BTNode root, int level)
    {
        Integer x = 0;

        if (root == null)
        return 0;

        if (level % 2 == 0)
        x = (Integer) root.elem * (-1);

        else
        x = (Integer) root.elem;


        x += helperMeth(root.left, level+1);
        x += helperMeth(root.right, level+1);
        
        return x;
    }
    //============================================================================

}
