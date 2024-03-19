package dataStructures;

public class listNode {
    int value;
    listNode next;
    listNode prev;

    public listNode(){
    }

    public listNode(int value){
        this.value=value;
    }

    public listNode(int value,listNode next){
        this.value=value;
        this.next=next;
    }

    public listNode(int value,listNode next,listNode prev){
        this.value=value;
        this.next=next;
        this.prev=prev;
    }
}
