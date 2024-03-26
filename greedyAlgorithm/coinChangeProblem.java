package greedyAlgorithm;

import java.util.Arrays;

public class coinChangeProblem {
    public static void solve(int[] coins,int value){
        Arrays.sort(coins);
        int index=coins.length-1;
        while(true){
            int coinValue=coins[index];
            index--;
            int maxAmount=(value/coinValue)*coinValue;
            if(maxAmount>0){
                System.out.println("Coin value : "+coinValue+" taken count : "+(value/coinValue));
                value=value-maxAmount;
            }
            if(value==0)break;
        }
    }
}
