package dataStructures;

public class stack {
    listNode root;
    listNode end;
    int size=0;
    
    public stack(listNode node){
        root=node;
        end=root;
        size=1;
    }

    public void push(int value){
        try{
            if(size==0){
                root=new listNode(value);
                end=root;
                System.out.println("The value is pushed");
                size++;
            }
            else if(size<10){
                listNode head=new listNode(value);
                head.next=root;
                root=head;
                System.out.println("The value is pushed");
                size++;
            }
            else{
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println("Stack is full");
        }
    }

    public void pop(){
        try{
            System.out.println("The value is : "+root.value);
            root=root.next;
            size--;
        }
        catch(Exception e){
            System.out.println("Stack is empty");
        }
    }

    public void peek(){
        try{
            System.out.println("The next value is : "+root.value);
        }
        catch(Exception e){
            System.out.println("Stack is empty");
        }
    }

    public void isEmpty(){
        if(root==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
    }

    public void isFull(){
        if(size>=10){
            System.out.println("Stack is full");
        }
        else{
            System.out.println("Stack is not full");
        }
    }

    public void delete(){
        root=null;
        end=null;
    }

}
