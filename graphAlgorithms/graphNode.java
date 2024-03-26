package graphAlgorithms;

import java.util.ArrayList;

public class graphNode {
    public String name;
    public int index;
    public ArrayList<graphNode> neighbours=new ArrayList<graphNode>();
    public boolean isVisited=false;
    public graphNode parent;
    
    public graphNode(String name,int index){
        this.name=name;
        this.index=index;
    }
}
