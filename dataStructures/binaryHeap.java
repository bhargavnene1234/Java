package dataStructures;

public class binaryHeap {
    int arr[];
    int sizeOfHeap;

    public binaryHeap(int size){
        arr=new int[size+1];
        this.sizeOfHeap=0;
    }
    
    public boolean isEmpty(){
        if (sizeOfHeap==0){
            return true;
        }
        else{
            return false;
        }
    }

    public Integer peek(){
        if(isEmpty()){
            System.out.println("Heap is empty");
            return null;
        }
        return arr[1];
    }

    public int size(){
        return sizeOfHeap;
    }

    public void levelOrderTraversal(){
        if(isEmpty()){
            System.out.println("heap is empty");
            return;
        }
        for(int index=1;index<=sizeOfHeap;index++){
            System.out.print(arr[index]+"-");
        }
        System.out.println();
    }

    public void heapifyBotToTop(int index, String heapType){
        int parent=index/2;
        if(index<=1){
            return;
        }
        if(heapType=="Min"){
            if(arr[parent]>arr[index]){
                int temp=arr[parent];
                arr[parent]=arr[index];
                arr[index]=temp;
            }
        }
        else if(heapType=="Max"){
            if(arr[parent]<arr[index]){
                int temp=arr[parent];
                arr[parent]=arr[index];
                arr[index]=temp;
            }
        }
        heapifyBotToTop(parent, heapType);
    }

    public void insert(int value,String heapType){
        arr[sizeOfHeap+1]=value;
        sizeOfHeap++;
        heapifyBotToTop(sizeOfHeap, heapType);
        System.out.println("Value Inserted");
    }

    public void heapifyTopToBot(int index,String heapType){
        int left=index*2;
        int right=index*2+1;
        int swapChild=0;
        if(sizeOfHeap<left){
            return;
        }
        if(heapType=="Max"){
            if(sizeOfHeap==left){
                if(arr[index]<arr[left]){
                    int temp=arr[left];
                    arr[left]=arr[index];
                    arr[index]=temp;
                }
            }
            else{
                if(arr[left]>arr[right]){
                    swapChild=left;
                }
                else{
                    swapChild=right;
                }
                if(arr[index]<arr[swapChild]){
                    int temp=arr[swapChild];
                    arr[swapChild]=arr[index];
                    arr[index]=temp;
                }
            }
        }
        else if(heapType=="Min"){
            if(sizeOfHeap==left){
                if(arr[index]>arr[left]){
                    int temp=arr[left];
                    arr[left]=arr[index];
                    arr[index]=temp;
                }
            }
            else{
                if(arr[left]<arr[right]){
                    swapChild=left;
                }
                else{
                    swapChild=right;
                }
                if(arr[index]>arr[swapChild]){
                    int temp=arr[swapChild];
                    arr[swapChild]=arr[index];
                    arr[index]=temp;
                }
            }
        }
        heapifyTopToBot(swapChild, heapType);
    }
    
    public int extractHeadOfBH(String heapType){
        if(isEmpty()){
            return -1;
        }
        else{
            int extractedValue=arr[1];
            arr[1]=arr[sizeOfHeap];
            sizeOfHeap--;
            heapifyBotToTop(1, "Min");
            return extractedValue;
        }
    }

    public void delete(){
        arr=null;
        sizeOfHeap=0;
    }
}
