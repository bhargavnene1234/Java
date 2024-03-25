package sorting;

public class selectionSort {
    public void sort(int array[]) {
        int array_length = array.length;
        for (int start = 0; start < array_length - 1; start++) {
            int index = start;
            for (int com_index = index + 1; com_index < array_length; com_index++) {
                index = array[index] > array[com_index] ? com_index : index;
            }
            if(index!=start){
                int temp_value = array[start];
                array[start] =array[index];
                array[index] = temp_value;
            }
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
