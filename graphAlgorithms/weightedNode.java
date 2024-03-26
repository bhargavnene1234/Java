package graphAlgorithms;

import java.util.ArrayList;
import java.util.HashMap;

public class weightedNode implements Comparable<weightedNode>{
    public String name;
    public ArrayList<weightedNode> neighbours=new ArrayList<weightedNode>();
    public HashMap<weightedNode,Integer> weightMap=new HashMap<>();
    public boolean isVisited=false;
    public weightedNode parent;
    public int distance;
    public int index;
    public disjointSet set;

    public weightedNode(String name,int index){
        this.name=name;
        distance=Integer.MAX_VALUE;
        this.index=index;
    }

    public weightedNode(String name){
        this.name=name;
        distance=Integer.MAX_VALUE;
    }
    
    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(weightedNode node){
        return this.distance-node.distance;
    }
}
