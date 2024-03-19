package dataStructures;

public class binarySTNode {
    binarySTNode left;
    binarySTNode right;
    int value;
    int height=0;

    public binarySTNode(){

    }

    public binarySTNode(int value){
        this.value=value;
    }

    public binarySTNode(int value,int height){
        this.value=value;
        this.height=height;
    }

    public binarySTNode(int value,int height,binarySTNode left,binarySTNode right){
        this.value=value;
        this.height=height;
        this.left=left;
        this.right=right;
    }
}
