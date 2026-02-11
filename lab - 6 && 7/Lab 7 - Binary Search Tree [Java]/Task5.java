//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        //TO DO

        return helper_mir(root.left, root.right); // remove this line
    }

    private static Integer helper_mir(BSTNode root1, BSTNode root2)
    {
        Integer sum = 0;
        if (root1 == null || root2 == null)
        return 0;

        else sum = root1.elem + root2.elem;

        sum += helper_mir(root1.left, root2.right);
        sum += helper_mir(root1.right, root2.left);

        return sum;
    }

    //===============================================================


}
