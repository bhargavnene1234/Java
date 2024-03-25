package sorting;

public class main {

    public static void main(String[] args) {
        
        int arr[] = { 31, 23, 85, 42, 13, 84, 21, 38, 54, 87, 4 };
        
        //Bubble Sort

        /*
         * bubbleSort bubble=new bubbleSort();
         * bubble.sort(arr);
         * bubble.display(arr);
         */

        //Selection Sort

        /*
         * selectionSort select=new selectionSort();
         * select.sort(arr);
         * select.display(arr);
         */

        //Insertion Sort

        /*
         * insertionSort insert=new insertionSort();
         * insert.sort(arr);
         * insert.display(arr);
         */

        //Bucket Sort

        /*
         * bucketSort buck=new bucketSort(arr);
         * buck.printArray();
         * buck.sort();
         */
    
        //Merge Sort

        /*
         * mergeSort merge=new mergeSort();
         * int[] out=merge.sort(arr);
         * merge.display(out);
         */

        //Quick Sort

        /*
         * quickSort quick=new quickSort();
         * quick.sort(arr);
         * quick.display(arr);
         */

        //Heap Sort

        heapSort heap=new heapSort(arr);
        heap.sort();
        heap.display();
    }
}
