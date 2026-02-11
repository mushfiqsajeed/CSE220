//LAB TASK NO NEED TO SUBMIT
// Complete the sumTree method
public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){
            //TO DO
            Integer sum = helper(root, 0);

            return sum; //remove this line
        }

        public static Integer helper (BTNode root, int lvl)
        {
            Integer sum = 0;

            if(root == null)
            return 0;

            if(lvl == 0)
            sum = (Integer) root.elem;

            else
            sum = (Integer) root.elem % lvl;

            sum += (Integer)helper(root.left, lvl+1);
            sum += (Integer)helper(root.right, lvl+1);

            return sum;
        }
        //============================================================================

}
