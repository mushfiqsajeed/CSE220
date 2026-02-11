public class edge {
    Integer from;
    Integer to;

    edge next;
    int weight;

    public edge(Integer to, int weight)
    {
        this.to = to;

        this.weight = weight;
        next = null;
    }
    
}
