package graphAlgorithms;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class prims {
    ArrayList<weightedNode> nodeList=new ArrayList<weightedNode>();

    public prims(ArrayList<weightedNode> nodeList){
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
    }

    void prim(weightedNode node){
        for(int i=0;i<nodeList.size();i++){
            nodeList.get(i).distance=Integer.MAX_VALUE;
        }
        node.distance=0;
        PriorityQueue<weightedNode> queue=new PriorityQueue<>();
        queue.addAll(nodeList);
        while(!queue.isEmpty()){
            weightedNode currNode=queue.remove();
            for(weightedNode neighbour:currNode.neighbours){
                if(queue.contains(neighbour)){
                    if(neighbour.distance>currNode.weightMap.get(neighbour)){
                        neighbour.distance=currNode.weightMap.get(neighbour);
                        neighbour.parent=currNode;
                        queue.remove(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
        }
        int cost=0;
        for(weightedNode nodeToCheck:nodeList){
            System.out.println("Node : "+nodeToCheck+",Key : "+nodeToCheck.distance+",Parent : "+nodeToCheck.parent);
            cost=cost+nodeToCheck.distance;
        }
        System.out.println("Total Cost of MST:"+cost);
    }
}
