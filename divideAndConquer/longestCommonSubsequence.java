package divideAndConquer;

public class longestCommonSubsequence {
    private int findLCS(String str1,String str2,int index1,int index2){
        if (index1==str1.length() || index2==str2.length()){
            return 0;
        }
        if (str1.charAt(index1)==str2.charAt(index2)) {
            return 1 + findLCS(str1, str2, index1+1, index2+1);
        }
        else{
            int op1=findLCS(str1, str2, index1+1, index2);
            int op2=findLCS(str1, str2, index1, index2+1);
            return Math.max(op1, op2);
        }
    }

    public int findLongestCommonSubsequence(String str1,String str2){
        return findLCS(str1, str2, 0, 0);
    }
}
