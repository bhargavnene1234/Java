package divideAndConquer;

public class zeroOneKnapsack {
    private int ZOKnapsack(int[] profits,int[] weight,int capacity,int index){
        if(capacity<=0 || index<0 || index>=profits.length){
            return 0;
        }
        if(weight[index]<=capacity){
            int profit1=profits[index]+ZOKnapsack(profits, weight, capacity-weight[index], index+1);
            int profit2=ZOKnapsack(profits, weight, capacity, index+1);
            return Math.max(profit1, profit2);
        }
        else{
            return 0;
        }
        
        
    }

    public int ZeroOneKnapSack(int[] profits,int[] weights,int capacity){
        return ZOKnapsack(profits, weights, capacity, 0);
    }
}
