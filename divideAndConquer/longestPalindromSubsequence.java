package divideAndConquer;

public class longestPalindromSubsequence {
    private int findlps(String str,int startIndex,int endIndex){
        if(startIndex>endIndex) return 0;
        if(startIndex==endIndex) return 1;
        if (str.charAt(startIndex)==str.charAt(endIndex)) {
            return 2+findlps(str, startIndex+1, endIndex-1);
        }
        else{
            int op1=findlps(str, startIndex+1, endIndex);
            int op2=findlps(str, startIndex, endIndex-1);
            return Math.max(op1, op2);
        }
    }

    public int findLongestCommonSubsequence(String str){
        return findlps(str, 0,str.length()-1);
    }
}
