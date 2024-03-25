package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class bucketSort {
    int arr[];

    public bucketSort(int arr[]){
        this.arr=arr;
    }

    public void printArray(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public void printBucket(ArrayList<Integer>[] buckets){
        for(int i=0;i<buckets.length;i++){
            System.out.println("Bucket#"+i+":");
            for(int j=0;j<buckets[i].size();j++){
                System.out.print(buckets[i].get(j)+" ");
            }
            System.out.println();
        }
    }

    public void sort(){
        int numberOfBuckets=(int)Math.ceil(Math.sqrt(arr.length));
        int maxValue=Integer.MIN_VALUE;
        for(int value:arr){
            if(value>maxValue){
                maxValue=value;
            }
        }

        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] buckets=new ArrayList[numberOfBuckets];
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new ArrayList<Integer>();
        }

        for(int value:arr){
            int bucketNumber=(int)Math.ceil(((float)value*numberOfBuckets)/(float)maxValue);
            buckets[bucketNumber-1].add(value);

        System.out.println("Printing buckets before sorting:");
        printBucket(buckets);

        for(ArrayList<Integer> bucket:buckets){
            Collections.sort(bucket);
        }

        System.out.println("Printing buckets after sorting:");
        printBucket(buckets);

        int index=0;
        for(ArrayList<Integer> bucket:buckets){
            for(int val:bucket){
                arr[index]=val;
                index++;
            }
        }
        }
    }
}
