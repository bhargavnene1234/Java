package graphAlgorithms;

public class undirectedEdge {
    public weightedNode first;
    public weightedNode second;
    public int weight;

    public undirectedEdge(weightedNode first,weightedNode second,int weight){
        this.first=first;
        this.second=second;
        this.weight=weight;
    }

    @Override
    public String toString(){
        return "Edge("+first+","+second+"),weight="+weight;
    }
}
