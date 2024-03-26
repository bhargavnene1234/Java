package graphAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class adjacencyMatrix {
    ArrayList<graphNode> nodeList=new ArrayList<graphNode>();
    int[][] adjMatrix;

    public adjacencyMatrix(ArrayList<graphNode> nodeList){
        this.nodeList=nodeList;
        adjMatrix=new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int index1,int index2){
        adjMatrix[index1][index2]=1;
        adjMatrix[index2][index1]=1;
    }

    public void addDirectedEdge(int index1,int index2){
        adjMatrix[index1][index2]=1;
    }

    @Override
    public String toString(){
        StringBuilder out=new StringBuilder();
        out.append(" ");
        for(int i=0;i<nodeList.size();i++){
            out.append(nodeList.get(i).name+" ");
        }
        out.append("\n");
        for(int i=0;i<nodeList.size();i++){
            out.append(nodeList.get(i).name+":");
            for(int j:adjMatrix[i]){
                out.append(j+" ");
            }
            out.append("\n");
        }
        return out.toString();
    }

    public ArrayList<graphNode> getNeighbours(graphNode node){
        ArrayList<graphNode> neighbours=new ArrayList<graphNode>();
        int nodeIndex=node.index;
        for(int i=0;i<adjMatrix.length;i++){
            if(adjMatrix[nodeIndex][i]==1){
                neighbours.add(nodeList.get(i));
            }
        }
        return neighbours;
    }

    void bfsVisit(graphNode node){
        LinkedList<graphNode> queue=new LinkedList<graphNode>();
        queue.add(node);
        while(!queue.isEmpty()){
            graphNode currnode=queue.remove(0);
            currnode.isVisited=true;
            System.out.print(currnode.name+" ");
            ArrayList<graphNode> neighbours=getNeighbours(currnode);
            for(graphNode neighbour:neighbours){
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
            ArrayList<graphNode> neighbours=getNeighbours(currnode);
            for(graphNode neighbour:neighbours){
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
        ArrayList<graphNode> neighbours=getNeighbours(node);
        for(graphNode neighbour:neighbours){
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
            ArrayList<graphNode> neighbours=getNeighbours(currNode);
            for(graphNode neighbour:neighbours){
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
