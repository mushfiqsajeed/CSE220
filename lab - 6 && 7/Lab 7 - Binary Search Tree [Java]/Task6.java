//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST( BSTNode root ){
        //TO DO
        boolean x = Check_helper(root, 999999999, -999999999);

        return x;
         // remove this line

    }

    private static boolean Check_helper(BSTNode root, Integer max, Integer min)
    {
        boolean check = true;

        if (root == null)
        return check;

        if ((root.elem >= max) || (root.elem <= min))
        {
            return false;
        }  

        check = Check_helper(root.left, root.elem, min) && Check_helper(root.right, max, root.elem);
        return check;
    }
    //==============================================================


}
