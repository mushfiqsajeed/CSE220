/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new FruitNode[size];
    }
    
    //This method basically prints the HashTable
    //DO NOT change this method
    public void show(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    //you need to COMPLETE this method
    private int hashFunction( String key ){
        // TO DO
        int len = key.length();
        int sum = 0;

        if (len%2 == 0)
        {
            for (int i=0; i<len; i++)
            {
                if (i%2 == 0)
                sum += key.charAt(i);
            }
        }

        else
        {
            for (int i=0; i<len; i++)
            {
                if (i%2 != 0)
                sum += key.charAt(i);
            }
        }

        int len_ht = ht.length;
        int x = sum % len_ht;
        
        return x; //remove this line
    }

    //you need to COMPLETE this method
    //The insert() method will create a FruitNode using name(Key) & price(value)
	//then inserts it in the proper hashed index
    //If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value){
        
        int indx = hashFunction(key);
        FruitNode current = ht[indx];

        FruitNode newNode = new FruitNode(key, value);

        if (current == null)
        {
            ht[indx] = newNode;
        }

        while (current != null)
        {
            if(current.fruit[0].equals(key))
            {
                current.fruit[1] = value;
                return;
            }

            else
            {
                if (value > (Integer)current.fruit[1])
                {
                    if (current == ht[indx])
                    {
                        newNode.next = current;
                        ht[indx] = newNode;
                        return;
                    }

                    else
                    {
                        FruitNode temp = current.next;
                        current.next = newNode;
                        newNode.next = temp;
                        return;
                    }
                }
                else if (value < (Integer)current.fruit[1])
                {
                    FruitNode temp = current.next;
                    current.next = newNode;
                    newNode.next = temp;
                    return;
                }

                current = current.next;
            }

        }

    }

}
