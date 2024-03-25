package sorting;

public class mergeSort {
    public int[] sort(int[] array) {
        int array_length = array.length;
        if (array_length == 0 || array_length == 1) {
            return array;
        } else if (array_length == 2) {
            if (array[0] > array[1]) {
                int temp = 0;
                temp = array[0];
                array[0]=array[1];
                array[1]=temp;
            }
            return array;
        } else {
            int split = array_length / 2;
            int buffer[] = new int[array_length];
            int left_values[] = new int[split];
            int right_values[] = new int[array_length-split];

            for(int index=0;index<split;index++){
                left_values[index]=array[index];
            }

            for(int index=0;index<array_length-split;index++){
                right_values[index]=array[index+split];
            }

            int sorted_left_values[]= sort(left_values);
            int sorted_right_values[] = sort(right_values);

            int index_left_counter = 0;
            int index_right_counter = 0;
            int sorted_left_length=sorted_left_values.length;
            int sorted_right_length=sorted_right_values.length;
            while (index_left_counter < sorted_left_length || index_right_counter < sorted_right_length) {
                if (index_left_counter < sorted_left_length
                        && index_right_counter < sorted_right_length) {
                    if (sorted_left_values[index_left_counter] <= sorted_right_values[index_right_counter]) {
                        buffer[index_left_counter+index_right_counter]=sorted_left_values[index_left_counter];
                        index_left_counter++;
                    } else {
                        buffer[index_left_counter+index_right_counter]=sorted_right_values[index_right_counter];
                        index_right_counter++;
                    }
                } else if (index_left_counter < sorted_left_length) {
                    buffer[index_left_counter+index_right_counter]=sorted_left_values[index_left_counter];
                    index_left_counter++;
                } else {
                    buffer[index_left_counter+index_right_counter]=sorted_right_values[index_right_counter];
                    index_right_counter++;
                }
            }
            return buffer;

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
