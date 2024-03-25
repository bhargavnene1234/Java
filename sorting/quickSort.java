package sorting;


public class quickSort {

    public int partition(int array[],int start,int end) {
        int pivot=end;
        int out=start-1;
        for(int index=start;index<=end;index++){
            if(array[index]<=array[pivot]){
                out++;
                int temp=array[index];
                array[index]=array[out];
                array[out]=temp;
            }
        }
        return out;
    }

    public void QuickSort(int arr[],int start,int end){
        if(start<end){
            int pivot=partition(arr, start, end);
            QuickSort(arr,start,pivot-1);
            QuickSort(arr,pivot+1,end);
        }
    }

    public void sort(int arr[]){
        QuickSort(arr,0, arr.length-1);
    }

    public void display(int arr[]){
        int len=arr.length;
        for(int index=0;index<len;index++){
            System.out.print(arr[index]+"-");
        }
        System.out.println();
    }
}
