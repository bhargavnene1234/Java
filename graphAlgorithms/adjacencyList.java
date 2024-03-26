package graphAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class adjacencyList {
    ArrayList<graphNode> nodeList=new ArrayList<graphNode>();

    public adjacencyList(ArrayList<graphNode> nodelList){
        this.nodeList=nodelList;
    }

    public void addUndirectedEdge(int index1,int index2){
        graphNode first=nodeList.get(index1);
        graphNode second=nodeList.get(index2);
        first.neighbours.add(second);
        second.neighbours.add(first);
    }

    public void addDirectedEdge(int index1,int index2){
        graphNode first=nodeList.get(index1);
        graphNode second=nodeList.get(index2);
        first.neighbours.add(second);
    }

    @Override
    public String toString(){
        StringBuilder out=new StringBuilder();
        for(int i=0;i<nodeList.size();i++){
            out.append(nodeList.get(i).name+" ");
            for(int j=0;j<nodeList.get(i).neighbours.size();j++){
                if(j==nodeList.get(i).neighbours.size()-1){
                    out.append(nodeList.get(i).neighbours.get(j).name);
                }
                else{
                    out.append(nodeList.get(i).neighbours.get(j).name+"->");
                }
            }
            out.append("\n");
        }
        return out.toString();
    }

    void bfsVisit(graphNode node){
        LinkedList<graphNode> queue=new LinkedList<graphNode>();
        queue.add(node);
        while(!queue.isEmpty()){
            graphNode currnode=queue.remove(0);
            currnode.isVisited=true;
            System.out.print(currnode.name+" ");
            for(graphNode neighbour:currnode.neighbours){
                if(!neighbour.isVisited){
                    queue.add(neighbour);
                    neighbour.isVisited=true;
                }
            }
        }
    }
    
    public void bfs(){
        for(graphNode node:nodeList){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }

    void dfsVisit(graphNode node){
        Stack<graphNode> stack=new Stack<graphNode>();
        stack.push(node);
        while(!stack.isEmpty()){
            graphNode currnode=stack.pop();
            currnode.isVisited=true;
            System.out.print(currnode.name+" ");
            for(graphNode neighbour:currnode.neighbours){
                if(!neighbour.isVisited){
                    stack.push(neighbour);
                    neighbour.isVisited=true;
                }
            }
        }
    }
    
    public void dfs(){
        for(graphNode node:nodeList){
            if(!node.isVisited){
                dfsVisit(node);
            }
        }
    }

    public void topologicalVisit(graphNode node,Stack<graphNode> stack){
        for(graphNode neighbour:node.neighbours){
            if(!neighbour.isVisited){
                topologicalVisit(neighbour, stack);
            }
        }
        node.isVisited=true;
        stack.push(node);
    }

    void topologicalSort(){
        Stack<graphNode> stack=new Stack<graphNode>();
        for(graphNode node:nodeList){
            if(!node.isVisited){
                topologicalVisit(node, stack);
        
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop().name+" ");
        }
        System.out.println();
    }

    public static void pathPrint(graphNode node){
        if(node.parent!=null){
            pathPrint(node.parent);
        }
        System.out.print(node.name+" ");
    }
    
    public void BFSforSSSPP(graphNode node){
        LinkedList<graphNode> queue=new LinkedList<graphNode>();
        queue.add(node);
        while (!queue.isEmpty()) {
            graphNode currNode=queue.remove(0);
            currNode.isVisited=true;
            System.out.print("Printing path: ");
            pathPrint(currNode);
            for(graphNode neighbour:currNode.neighbours){
                if(!neighbour.isVisited){
                    queue.add(neighbour);
                    neighbour.isVisited=true;
                    neighbour.parent=currNode;
                }
            }
            System.out.println();
        }
    }
}
