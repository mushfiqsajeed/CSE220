public class AssignmentTask5 {

    //SUBMIT ONLY THIS METHOD
    public static void sumOddAppend(Node dh) {
        // TO DO
        Node current = dh.next;
        Integer sum = 0;

        while (current != dh) 
        {
            Integer temp = (Integer) current.elem;
            if (temp % 2 != 0)
            {
                sum += temp;
                if (current == dh.next)
                {
                    Node temp1 = current.next;
                    dh.next = temp1;
                    current = dh.next;
                }

                else
                {
                    Node curr = dh.next;

                    while (curr.next != current)
                    {
                        curr = curr.next;
                    }
                    //Curr er bhitor ache prev value of current
                    Node x = current.next;
                    curr.next = x;
                    current = curr.next;
                }

            }
            else
            current = current.next;
        }

        Node curr = dh.next;
        while (curr.next != dh)
        {
            curr = curr.next;
        }
        
        Node lastNode = new Node(sum);
        Node last = curr.next;
        curr.next = lastNode;
        lastNode.next = last;
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {11, 22, 33, 44, 55, 66};
        Node head = LinkedListHelpers.createDummyHeadedSinglyCircularLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
        System.out.println("\nExpected Output:");
        Object[] expected = {22, 44, 66, 99};
        Node expectedHead = LinkedListHelpers.createDummyHeadedSinglyCircularLL(expected, true);
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(expectedHead);
        
        //Running the Sum Odd Append
        sumOddAppend(head);
        //Printing after Sum Odd Append
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
    }
}
