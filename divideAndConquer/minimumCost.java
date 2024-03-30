package divideAndConquer;

public class minimumCost {
    private int findMinCost(int[][] array,int row,int col){
        if (row==-1 || col==-1) {
            return Integer.MAX_VALUE;
        }
        if (row==0 && col==0){
            return array[row][col];
        }
        else{
            int op1=findMinCost(array, row-1, col);
            int op2=findMinCost(array, row, col-1);
            return array[row][col]+Math.min(op1, op2);
        }
    }

    public int findMinimunCost(int[][] array){
        return findMinCost(array , array.length-1 , array[0].length-1);
    }
}
