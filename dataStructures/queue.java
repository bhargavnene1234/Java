package dataStructures;

public class queue {

    listNode root;
    listNode end;
    int size=0;
    
    public queue(listNode node){
        root=node;
        end=root;
        size=1;
    }

    public void enQueue(int value){
        try{
            if(size==0){
                root=new listNode(value);
                end=root;
                System.out.println("The value is pushed");
                size++;
            }
            else if(size<10){
                end.next=new listNode(value);
                end=end.next;
                System.out.println("The value is pushed");
                size++;
            }
            else{
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println("Queue is full");
        }
    }

    public void deQueue(){
        try{
            System.out.println("The value is : "+root.value);
            root=root.next;
            size--;
        }
        catch(Exception e){
            System.out.println("Queue is empty");
        }
    }

    public void peek(){
        try{
            System.out.println("The next value is : "+root.value);
        }
        catch(Exception e){
            System.out.println("Queue is empty");
        }
    }

    public void isEmpty(){
        if(root==null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Queue is not empty");
        }
    }

    public void isFull(){
        if(size>=10){
            System.out.println("Queue is full");
        }
        else{
            System.out.println("Queue is not full");
        }
    }

    public void delete(){
        root=null;
        end=null;
    }
    
}
