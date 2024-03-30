package divideAndConquer;

public class stringToAnother {
    private int findMinOperator(String first,String second,int index1,int index2){
        if(index1==first.length()) return second.length()-index2;
        if(index2==second.length()) return first.length()-index1;
        if(first.charAt(index1)==second.charAt(index2)){
            return findMinOperator(first, second, index1+1, index2+1);
        }
        else{
            int deleteOP=1+findMinOperator(first, second, index1, index2+1);
            int insertOP=1+findMinOperator(first, second, index1+1, index2);
            int replaceOP=1+findMinOperator(first, second, index1+1, index2+1);  
            return Math.min(deleteOP,Math.min(insertOP,replaceOP));
        }
    }

    public int findMinOperator(String first,String second){
        return findMinOperator(first, second, 0, 0);
    }
}
