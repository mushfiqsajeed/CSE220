import java.util.Random;

public class Task3 {

    // Task 3A: Print elements of a linked list using loop
    public static void task3A(Node head) {
        // TODO: Implement this using a loop
        Node curr = head;

        while (curr != null)
        {
            if (curr.next == null)
            System.out.print(curr.elem);

            else
            System.out.print(curr.elem + " -> ");

            curr = curr.next;
        }
        System.out.print( "-> null");
    }

    // Task 3B: Print elements of a linked list using recursion
    public static void task3B_recursive(Node head) {
        // TODO: Implement this recursively

        if (head.next == null)
        {
            System.out.print(head.elem);
            System.out.print( "-> null");
        }
        
        else 
        {
            System.out.print(head.elem + " -> ");
            task3B_recursive(head.next);
        }
    }

    // Task 3C: Return sum of all elements using loop
    public static int task3C(Node head) {
        // TODO: Implement this using a loop
        Node curr = head;
        int sum = 0;
        
        while (curr != null) 
        {
            sum += curr.elem;
            curr = curr.next;
        }
        return sum;
    }

    // Task 3D: Return sum of all elements using recursion
    public static int task3D_recursive(Node head) {
        // TODO: Implement this recursively

        if (head == null)
        return 0;

        else
        return head.elem + task3D_recursive(head.next);
    }

    // Task 3E: Return (sum of odd) - (product of even) using loop
    public static int task3E(Node head) {
        // TODO: Implement this using a loop
        Node curr = head;
        int sum_odd = 0;
        int product_even = 1;

        while (curr != null) 
        {
            if (curr.elem % 2 == 0)
            {
                product_even = product_even * curr.elem;
                curr = curr.next;
            }

            else
            {
                sum_odd += curr.elem;
                curr = curr.next; 
            }
        }
        return (sum_odd - product_even);
    }

    // Task 3F: Return (sum of odd) - (product of even) using recursion
    public static int task3F_recursive(Node head) {
        // TODO: Implement this recursively
        int odd_sum = odd_recursive(head);
        int even_product = even_recursive(head);

        return (odd_sum - even_product);
    }

    //Helper Functions
    public static int odd_recursive(Node head)
    {
        if (head == null) return 0;

        if (head.elem % 2 != 0)
        return head.elem + odd_recursive(head.next);

        else
        return 0 + odd_recursive(head.next);
    }

    public static int even_recursive(Node head)
    {
        if (head == null) return 1;

        if (head.elem % 2 == 0)
        return head.elem * even_recursive(head.next);

        else
        return 1 * even_recursive(head.next);
    }


    public static void main(String[] args) {
        // Driver code for testing Task 3 methods
        Node head = arr2LL( generateRandomArray(6, 1, 20) );
        
        System.out.println(" Task3A ");
        System.out.println("Expected Output: ");
        showLL(head);
        System.out.println("Your Output: ");
        task3A(head);

        System.out.println("\n Task3B ");
        System.out.println("Expected Output: ");
        showLL(head);
        System.out.println("Your Output: ");
        task3B_recursive(head);

        System.out.println("\n------------------------------");

        head = arr2LL( new int[]{23,5,3,11,7,6} );
        System.out.println("\n Task3C ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: "+55);
        System.out.println("Your Output: "+task3C(head));

        System.out.println("\n Task3D ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: "+55);
        System.out.println("Your Output: "+task3D_recursive(head));

        System.out.println("\n------------------------------");

        head = arr2LL( new int[]{3,5,8,3,2} );
        System.out.println("\n Task3E ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: "+(-5));
        System.out.println("Your Output: "+task3E(head));

        System.out.println("\n Task3F ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: "+(-5));
        System.out.println("Your Output: "+task3F_recursive(head));

        System.out.println("\n------------------------------");
    }



    //helper methods
    public static Node arr2LL(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node n = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            n.next = newNode;
            n = newNode;
        }
        return head;
    }
    
    public static int[] generateRandomArray(int size, int start, int end) {
        if (start > end)
            throw new IllegalArgumentException("Start value must be less than or equal to end value.");
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++)
            arr[i] = rand.nextInt(end - start + 1) + start;
        return arr;
    }

    public static void showLL(Node head) {
        while (head != null) {
            System.out.print(head.elem + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
