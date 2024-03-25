package sorting;
import dataStructures.binaryHeap;
public class heapSort {
    int arr[];

    public heapSort(int arr[]){
        this.arr=arr;
    }

    public void sort(){
        binaryHeap bh=new binaryHeap(arr.length);
        for(int index=0;index<arr.length;index++){
            bh.insert(arr[index], "Min");
        }

        for(int index=0;index<arr.length;index++){
            arr[index]=bh.extractHeadOfBH("Min");
        }
    }

    public void display(){
        int len=arr.length;
        for(int index=0;index<len;index++){
            System.out.print(arr[index]+"-");
        }
        System.out.println();
    }
}
