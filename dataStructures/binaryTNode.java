package dataStructures;

public class binaryTNode {
    binaryTNode left;
    binaryTNode right;
    String value;
    int height;

    public binaryTNode(){

    }

    public binaryTNode(String value){
        this.value=value;
    }

    public binaryTNode(String value,int height){
        this.value=value;
        this.height=height;
    }

    public binaryTNode(String value,int height,binaryTNode left,binaryTNode right){
        this.value=value;
        this.height=height;
        this.left=left;
        this.right=right;
    }
}
