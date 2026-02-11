public class MinHeap {
    private int[] arr;
    private int size = 0;

    public MinHeap (int capacity)
    {
        arr = new int[capacity];
    }

    public void insert (int x)
    {
        if (size < arr.length-1)
        {
            arr[++size] = x;
            swim();
        }

        else
        System.out.println("Heap is full!");
    }

    public void swim()
    {
        int child = size;
        int parent = child/2;

        while (parent > 0 && arr[parent]>arr[child]) 
        {
            swap(parent, child);
            child = parent;
            parent = child/2;
        }
    }

    public void swap (int p, int c)
    {
        int temp = arr[p];
        arr[p] = arr[c];
        arr[c] = temp;
    }
    

    public void sink()
    {
        int parent = 1;
        int left = 2 * parent;
        int right = left + 1;

        while (left <= size)
        {
            int SmallChild = right;

            if (right <= size && arr[left] < arr[right])
            {
                SmallChild = left;
            }

            if (arr[parent] <= arr[SmallChild])
            break;

            swap(parent, SmallChild);
            parent = SmallChild;

            left = 2 * parent;
            right = left + 1;
        }
    }

    public Integer extractMin()
    {
        if (size == 0)
        return null;

        int x = arr[1];
        swap(1, size);
        size--;
        sink();

        return x;
    }

    public void sort()
    {
        int originalSize = size;
        while (size > 1)
        {
            swap(1, size);
            size--;
            sink();
        }
        size = originalSize;
    }

    public int getSize()
    {
        return size;
    }

    public int[] getArray()
    {
        return arr;
    }
}
