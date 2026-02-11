public class AssignmentTask7 {

    //SUBMIT ONLY THIS METHOD
    public static void rangeMove(DNode dh, int start, int end) {
        // TO DO
        DNode current = dh.next;

        DNode lastNode = dh.prev;

        while (current != lastNode)
        {
            int x = (int) current.elem;

            if (x>=start && x<=end)
            {
                DNode temp_prev = current.prev;
                DNode temp_nxt = current.next;

                temp_prev.next = temp_nxt;
                temp_nxt.prev = temp_prev;

                DNode temp = current;
                DNode last = dh.prev;

                last.next = temp;
                temp.prev = last;
                
                temp.next = dh;
                dh.prev = temp;

                current = temp_nxt;
            }

            else
            current = current.next;
        }
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {5, 3, 7, 1, 9, 6, 2, 4};
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = {3, 1, 9, 2, 4, 5, 7, 6};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);
        
        //Running the Range Move with [5,7] range 
        rangeMove(dh, 5, 7);
        //Printing after Range Move
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}
