public class Edge {
    Integer destination;

    int weight;
    Edge next;

    public Edge(Integer destination, int weight)
    {
        this.destination = destination;
        this.weight = weight;
        
        next = null;
    }

}