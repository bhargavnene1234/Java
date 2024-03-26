package graphAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class kruskal {
    ArrayList<weightedNode> nodeList=new ArrayList<weightedNode>();
    ArrayList<undirectedEdge> edgeList=new ArrayList<undirectedEdge>();
    
    public kruskal(ArrayList<weightedNode> nodeList){
        this.nodeList=nodeList;
    }
    public void addWeightedUndirectedEdge(int firstIndex,int secondIndex,int weight){
        undirectedEdge edge=new undirectedEdge(nodeList.get(firstIndex), nodeList.get(secondIndex), weight);
        weightedNode first=edge.first;
        weightedNode second=edge.second;
        first.neighbours.add(second);
        second.neighbours.add(first);
        first.weightMap.put(second, weight);
        second.weightMap.put(first, weight);
        edgeList.add(edge);
    }

    public void Kruskal(){
        disjointSet.makeSet(nodeList);
        Comparator<undirectedEdge> comparator=new Comparator<undirectedEdge>(){
            @Override
            public int compare(undirectedEdge o1,undirectedEdge o2){
                return o1.weight-o2.weight;
            }
        };
        Collections.sort(edgeList,comparator);
        int cost=0;
        for(undirectedEdge edge:edgeList){
            weightedNode first=edge.first;
            weightedNode second=edge.second;
            if(disjointSet.findSet(first)!=disjointSet.findSet(second)){
                disjointSet.union(first, second);
                cost+=edge.weight;
                System.out.println("Taken "+edge);
            }
        }
        System.out.println("Total Cost of MST: "+cost);
    }
}
