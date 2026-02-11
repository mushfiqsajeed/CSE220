public class AssignmentTask6 {

    //SUBMIT ONLY THIS METHOD
    public static void pairJoin(DNode dh1, DNode dh2) {
        // TO DO
        DNode curr1 = dh1.next;
        DNode curr2 = dh2.next;

        while (curr1 != null) 
        {
            if (curr1.next == null)
            {
                curr1.next = curr2;
                curr2.prev = curr1;

                curr2.next = dh1;
                dh1.prev = curr2;
                break;
            }

            DNode temp_next = curr1.next;
            DNode temp_prev = temp_next.prev;
            DNode curr2_nxt = curr2.next;

            curr1.next = curr2;
            curr2.prev = temp_prev;

            curr2.next = temp_next;
            temp_next.prev = curr2;

            curr1 = temp_next;
            curr2 = curr2_nxt;
        }

    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] list1 = {"A", "B", "C", "D"};
        Object[] list2 = {"E", "F", "G", "H"};

        DNode dh1 = LinkedListHelpers.createDummyHeadedDoublyLL(list1, false);
        DNode dh2 = LinkedListHelpers.createDummyHeadedDoublyLL(list2, false);

        System.out.println("Given Linked List 1:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh1);

        System.out.println("Given Linked List 2:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh2);

        System.out.println("\nExpected Output:");
        Object[] expected = {"A", "E", "B", "F", "C", "G", "D", "H"};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

        //Running the Pair Join
        pairJoin(dh1, dh2);
        //Printing after Pair Join
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh1);
    }
}
