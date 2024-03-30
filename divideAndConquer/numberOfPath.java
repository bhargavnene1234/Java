package divideAndConquer;

public class numberOfPath {
    private int findnumOfPath(int[][] array,int row,int col,int cost){
        if (cost<0) {
            return 0;
        }
        else if (row==0 && col==0) {
            if(array[row][col]-cost==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        else if(row==0){
            return findnumOfPath(array,row, col-1, cost-array[row][col]);
        }
        else if(col==0){
            return findnumOfPath(array,row-1,col, cost-array[row][col]);
        }
        else{
            int op1=findnumOfPath(array, row-1, col, cost-array[row][col]);
            int op2=findnumOfPath(array, row, col-1, cost-array[row][col]);
            return op1+op2;
        }
    }

    public int findNumberOfPaths(int[][] array,int cost){
        return findnumOfPath(array,array.length-1,array[0].length-1, cost);
    }
}
