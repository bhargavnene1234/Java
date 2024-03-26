package graphAlgorithms;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class weightedGraph {
    ArrayList<weightedNode> nodeList=new ArrayList<weightedNode>();

    public weightedGraph(ArrayList<weightedNode> nodeList){
        this.nodeList=nodeList;
    }

    public void dijkstra(weightedNode node){
        PriorityQueue<weightedNode> queue=new PriorityQueue<>();
        node.distance=0;
        queue.addAll(nodeList);
        while(!queue.isEmpty()){
            weightedNode currNode=queue.remove();
            for(weightedNode neighbour:currNode.neighbours){
                if(queue.contains(neighbour)){
                    if(neighbour.distance>currNode.distance+currNode.weightMap.get(neighbour)){
                        neighbour.distance=currNode.distance+currNode.weightMap.get(neighbour);
                        neighbour.parent=currNode;
                        queue.remove(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
        }
        for(weightedNode nodeToCheck:nodeList){
            System.out.print("Node "+nodeToCheck+" distance : "+nodeToCheck.distance+" ,Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

    public static void pathPrint(weightedNode node){
        if(node.parent!=null){
            pathPrint(node.parent);
        }
        System.out.print(node.name+" ");
    }

    public void addWeightedEdge(int index1,int index2,int weight){
        weightedNode first=nodeList.get(index1);
        weightedNode second=nodeList.get(index2);
        first.neighbours.add(second);
        first.weightMap.put(second, weight);
    }

    public void bellmanFord(weightedNode sourceNode){
        sourceNode.distance=0;
        for(int i=0;i<nodeList.size();i++){
            for(weightedNode currNode:nodeList){
                for(weightedNode neighbour:currNode.neighbours){
                    if(neighbour.distance>currNode.distance+currNode.weightMap.get(neighbour)){
                        neighbour.distance=currNode.distance+currNode.weightMap.get(neighbour);
                        neighbour.parent=currNode;
                    }
                }
            }
        }
        System.out.println("Checking negative cycle");
        for(weightedNode currNode:nodeList){
            for(weightedNode neighbour:currNode.neighbours){
                if(neighbour.distance>currNode.distance+currNode.weightMap.get(neighbour)){
                    System.out.println("Negative cycle found");
                    System.out.println("vertex name:"+neighbour.name);
                    System.out.println("old cost:"+neighbour.distance);
                    int newDistance=currNode.distance+currNode.weightMap.get(neighbour);
                    System.out.println("new cost:"+ newDistance);
                    return;
                }
            }
        }
        System.out.println("Negative cycle not found");
        for(weightedNode nodeToCheck:nodeList){
            System.out.print("Node "+nodeToCheck+", Distance : "+nodeToCheck.distance+", Path : ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

    public void floydWarshall(){
        int size=nodeList.size();
        int[][] vert=new int[size][size];
        for(int i=0;i<size;i++){
            weightedNode first=nodeList.get(i);
            for(int j=0;j<size;j++){
                weightedNode second=nodeList.get(j);
                if(i==j){
                    vert[i][j]=0;
                }
                else if(first.weightMap.containsKey(second)){
                    vert[i][j]=first.weightMap.get(second);
                }else{
                    vert[i][j]=Integer.MAX_VALUE/10;
                }
            }
        }
        for(int k=0;k<size;k++){
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    if(vert[i][j]>vert[i][k]+vert[k][j]){
                        vert[i][j]=vert[i][k]+vert[k][j];
                    }
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print("Printing distance list for node"+nodeList.get(i)+":");
            for(int j=0;j<size;j++){
                System.out.print(vert[i][j]+" ");
            }
            System.out.println();
        }
    }
}
