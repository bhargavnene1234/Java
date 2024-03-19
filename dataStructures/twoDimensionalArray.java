package dataStructures;

public class twoDimensionalArray {
    int[][] array = null;

    public twoDimensionalArray(int sizeOfRow, int sizeOfColumn) {
        array = new int[sizeOfRow][sizeOfColumn];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                array[row][column] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row, int column, int value) {
        try {
            if (array[row][column] == Integer.MIN_VALUE) {
                array[row][column] = value;
                System.out.println("Value inserted");
            } else {
                System.out.println("Location already occupied");
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid insert location");
        }
    }

    public void access(int row, int column) {
        try {
            if (array[row][column] == Integer.MIN_VALUE) {
                System.out.println("Value not inserted");
            } else {
                System.out.println("Value at location is : " + array[row][column]);
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid access location");
        }
    }

    public void traverse() {
        try {
            for (int row = 0; row < array.length; row++) {
                for (int column = 0; column < array[0].length; column++) {
                    if (array[row][column] != Integer.MIN_VALUE) {
                        System.out.print("-" + array[row][column] + "-");
                    } else {
                        System.out.print("-x-");
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Array does not exist");
        }
    }

    public void remove(int row,int column) {
        try {
            array[row][column] = Integer.MIN_VALUE;
            System.out.println("Location emptied");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid remove location");
        }
    }

    public void search(int value) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                if (array[row][column] == value) {
                    System.out.println("Value found at row : " + row + "and column : " + column);
                    return;
                }
            }
        }
        System.out.println("Value was not found");
    }

}
