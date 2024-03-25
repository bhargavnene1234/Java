package sorting;

public class insertionSort {
    public void sort(int array[]) {
        int array_length = array.length;
        for (int index = 0; index < array_length; index++) {
            int compare=array[index], compare_index=index ;
            while(compare_index>0 && array[compare_index-1]>compare){
                array[compare_index]=array[compare_index-1];
                compare_index--;
            }
            array[compare_index]=compare;
        }
    }
    
    public void display(int arr[]){
        int len=arr.length;
        for(int index=0;index<len;index++){
            System.out.print(arr[index]+"-");
        }
        System.out.println();
    }
}
