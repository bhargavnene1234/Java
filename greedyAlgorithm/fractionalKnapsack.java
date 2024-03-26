package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class fractionalKnapsack {
    public static void knapsack(ArrayList<knapsackItem> items,int capacity){
        Comparator<knapsackItem> comparator=new Comparator<knapsackItem>() {
            @Override
            public int compare(knapsackItem o1,knapsackItem o2){
                if(o2.getRatio()>o1.getRatio()) return 1;
                else return -1;
            }
        };
        Collections.sort(items,comparator);
        int usedCapacity=0;
        double totalValue=0;
        for(knapsackItem item:items){
            if(usedCapacity+item.getWeight()<=capacity){
                usedCapacity+=item.getWeight();
                System.out.println("Taken : "+item);
                totalValue+=item.getValue();
            }
            else{
                int usedWeight=capacity-usedCapacity;
                double value=item.getRatio()*usedWeight;
                System.out.println("Taken: Item index="+item.getIndex()+", value="+item.getValue()+", weight="+item.getWeight()+", ratio="+item.getRatio());
                usedCapacity+=usedWeight;
                totalValue+=value;
            }
            if(usedCapacity==capacity)break;
        }
        System.out.println("total value obtained:"+totalValue);
    }
}
