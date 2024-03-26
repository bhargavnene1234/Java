package graphAlgorithms;

import java.util.ArrayList;

public class disjointSet {
    private ArrayList<weightedNode> nodeList=new ArrayList<weightedNode>();
    
    public static void makeSet(ArrayList<weightedNode> nodeList){
        for(weightedNode node:nodeList){
            disjointSet set=new disjointSet();
            set.nodeList.add(node);
            node.set=set;
        }
    }

    public static disjointSet findSet(weightedNode node){
        return node.set;
    }

    public void printAllNodesOfThisSet(){
        System.out.println("Printing all nodes of the set : ");
        for(weightedNode node:nodeList){
            System.out.print(node+" ");
        }
        System.out.println();
    }

    public static disjointSet union(weightedNode node1,weightedNode node2){
        if(node1.set.equals(node2.set)){
            return null;
        }
        else{
            disjointSet set1=node1.set;
            disjointSet set2=node2.set;
            if(set1.nodeList.size()>set2.nodeList.size()){
                ArrayList<weightedNode> nodeSet2=set2.nodeList;
                for(weightedNode node:nodeSet2){
                    node.set=set1;
                    set1.nodeList.add(node);
                }
                return set1;
            }
            else{
                ArrayList<weightedNode> nodeSet1=set1.nodeList;
                for(weightedNode node:nodeSet1){
                    node.set=set2;
                    set2.nodeList.add(node);
                }
                return set2;
            }
        }
    }
}
