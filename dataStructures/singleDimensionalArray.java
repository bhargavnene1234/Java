package dataStructures;

public class singleDimensionalArray {
    int[] array = null;

    public singleDimensionalArray(int sizeOfArray) {
        array = new int[sizeOfArray];
        for (int index = 0; index < array.length; index++) {
            array[index] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int value) {
        try {
            if (array[location] == Integer.MIN_VALUE) {
                array[location] = value;
                System.out.println("Value inserted");
            } else {
                System.out.println("Location already occupied");
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid insert location");
        }
    }

    public void access(int location) {
        try {
            if (array[location] == Integer.MIN_VALUE) {
                System.out.println("Value not inserted");
            } else {
                System.out.println("Value at location is : " + array[location]);
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid access location");
        }
    }

    public void traverse(){
        try {
            for(int index=0;index<array.length;index++){
            if(array[index]!=Integer.MIN_VALUE){
                System.out.print("-"+array[index]+"-");
            }
            else{
                System.out.print("-x-");
            }
        }
            System.out.println();
        }catch(Exception e){
            System.out.println("Array does not exist");
        }
    }

    public void remove(int location) {
        try {
            array[location] = Integer.MIN_VALUE;
            System.out.println("Location emptied");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid remove location");
        }
    }

    public void search(int value){
        for(int index=0;index<array.length;index++){
            if(array[index]==value){
                System.out.println("Value found at index : "+index);
                return;
            }
        }
        System.out.println("Value was not found");
    }

}
